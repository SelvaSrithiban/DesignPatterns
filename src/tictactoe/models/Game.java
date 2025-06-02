package tictactoe.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import tictactoe.strategies.*;
import tictactoe.exceptions.InvalidMoveException;
import tictactoe.exceptions.UndoException;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player currentPlayer;
    private Player nextPlayer;
    private Player prevPlayer;
    private GameState currentState;
    Player winner;
    List<WinningStrategy> winningStrategies;
    private static Scanner scanner = new Scanner(System.in);

    private Game(Builder builder){
        this.board = new Board(builder.size);
        this.players = builder.players;
        this.moves = new ArrayList<>();
        this.currentPlayer = players.get(0);
        this.currentState = GameState.INPROGRESS;
        this.winner = null;
        this.winningStrategies = builder.winningStrategies;

    }
    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public List<Move> getMoves() {
        return moves;
    }
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    public GameState getCurrentState() {
        return currentState;
    }
    public void setCurrentState(GameState currentState) {
        this.currentState = currentState;
    }
    public Player getWinner() {
        return winner;
    }
    public void setWinner(Player winner) {
        this.winner = winner;
    }
    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }
    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void display(){
        board.displayBoard();
    }

    public boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row < 0 || col < 0 || row > board.getSize()-1 || col > board.getSize() -1 ){
            return false;
        }

        return board.getGrid().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }

    public void makeMove(Game game){

        //Player currentPlayer =  nextPlayer;
        if(currentPlayer.getType().equals(PlayerType.HUMAN)){
        System.out.println("It's " + currentPlayer.getName() +  "'s move. Please make your move");
        }else{
        System.out.println("It's " + currentPlayer.getName() +  "'s move.");
        }

        Move move = currentPlayer.makeMove(board);

        //validate the move
        if(!validateMove(move)){
            throw new InvalidMoveException("Invalid Move, Please try again");
        }

        //retrieve the row col
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        //make the move - update the cell
        Cell cell  = board.getGrid().get(row).get(col);
        cell.setCellState(CellState.OCCUPIED);
        cell.setSymbol(currentPlayer.getSymbol());
        move.setCell(cell);
        //add the move to the list
        moves.add(move);

        //check the winner
        if(checkWinner(move)){
            setWinner(currentPlayer);
            setCurrentState(GameState.WIN);
        } else if (moves.size() == board.getSize() * board.getSize()){
            setWinner(null);
            setCurrentState(GameState.DRAW);
        }

        //set the next player
        int idx = players.indexOf(currentPlayer);
        int nextIndex = (idx + 1) % players.size();
        prevPlayer = currentPlayer;
        nextPlayer = players.get(nextIndex);
        currentPlayer = nextPlayer;

        

    }

    public boolean checkWinner(Move move){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board, move)){
                return true;
            }
        }
        return false;
    }

    public void undoMove(Game game){

        //Allow if player is human
        if(prevPlayer.getType().equals(PlayerType.HUMAN)){

            //check if moves are made already
            if(moves.isEmpty()){
                System.out.println("No moves were made, undo opertion cannot be done");
            }

            System.out.println("Do you want to undo the operation? Choose [Y/N]");
            System.out.println("Note: Only Human player can perform undo operation, not the Bot player");
            String undoResponse = scanner.nextLine();
            if(undoResponse.equals("Y")){

                //get the last move
                Move lastMove = moves.get(moves.size()-1);

                //set the currentPlayer
                currentPlayer = prevPlayer;

                //decrement the count in winning startegy hashmap
                for(WinningStrategy winningStrategy : winningStrategies){
                    winningStrategy.undoMove(board, lastMove);
                }

                //remove the move from the list
                moves.remove(lastMove);

                //update the cell
                int row = lastMove.getCell().getRow();
                int col = lastMove.getCell().getCol();
                Cell cell  = board.getGrid().get(row).get(col);
                cell.setCellState(CellState.EMPTY);
                cell.setSymbol(null);
                
                //update the winner and game status
                winner = null;
                currentState = GameState.INPROGRESS;
                board.displayBoard();
            }
        }
    }

    public static class Builder{
        private int size;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        public Builder setSize(int size) {
            this.size = size;
            return this;
        }
        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public void validate(){
            // Players size = dimension - 1
            int playersCount = players.size();
            if(playersCount != size - 1){
                throw new RuntimeException("Invalid players count");
            }
            // At max 1 Bot in the game
            int botCount = 0;
            for(Player player : players){
                if(player.getType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount > 1){
                throw new RuntimeException("Number of Bot players is greater than 1. Can't start the game.");
            }
            
            //Every player should have separate symbol
            HashSet<Character> set = new HashSet<>();
            for(Player player : players){
                if(set.contains(player.getSymbol().getSymbol())){
                    throw new RuntimeException("The symbol " + player.getSymbol().getSymbol() + " is already chosen by other player.");
                }else{
                    set.add(player.getSymbol().getSymbol());
                }
            }
        }

        public Game build(){
            validate();
            return new Game(this);
        }

    }

}
