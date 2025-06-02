package tictactoe;

import tictactoe.controllers.GameController;
import tictactoe.models.*;
import tictactoe.strategies.*;

import java.util.*;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Gamecontroller should be a single object
        GameController gameController = new GameController();

        //create players
        List<Player> players = new ArrayList<>();
        //create human player
        players.add(new HumanPlayer(1, "Selva", new Symbol('X', "Green"), PlayerType.HUMAN));
        //create bot player
        players.add(new BotPlayer(1, "Robot", new Symbol('O', "Red"), PlayerType.BOT,BotDifficultyLevel.EASY));

        //create strategies
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        //winningStrategies.add(new CornerWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        //start the game
        Game game = gameController.startGame(3,players,winningStrategies);
        //display the contents
        gameController.display(game);
        //play the gamegot
        while(gameController.checkState(game).equals(GameState.INPROGRESS)){
            //make a move
            gameController.makeMove(game);
            gameController.display(game);
            //undo
            System.out.println("Do you want to undo the operation? Choose [Y/N]");
            System.out.println("Note: Only Human player can perform undo operation, not the Bot player");
            String undoResponse = scanner.nextLine();
            if(undoResponse.equals("Y")){
                gameController.undoMove(game);
                gameController.display(game);
            }else{
                System.out.println("Undo Operation is cancelled by the user.");
            }
        }
        //check if any winner
        if(gameController.checkState(game).equals(GameState.WIN)){
            System.out.println("Winner is " + gameController.getWinner(game).getName());
        }else if(gameController.checkState(game).equals(GameState.DRAW)){
            System.out.println("Game has ended in a draw");
        }

    }

}
