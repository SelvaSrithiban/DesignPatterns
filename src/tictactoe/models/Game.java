package tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player currentPlayer;
    private GameState currentState;
    Player winner;
    List<WinningStrategy> winningStrategies;

    private Game(Builder builder){
        this.board = new Board(builder.size);
        this.players = builder.players;
        this.moves = new ArrayList<>();
        this.currentPlayer = null;
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

    public boolean checkWinner(Move move){
        
        return false;
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
            // At max 1 Bot in the game

            // Players size = dimension - 1
            if(players.size() != size - 1){
                throw new RuntimeException("Invalid players count");
            }
            //Every player should have separate symbol
        }

        public Game build(){
            validate();
            return new Game(this);
        }

    }

}
