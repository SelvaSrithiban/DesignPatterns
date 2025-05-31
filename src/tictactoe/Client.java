package tictactoe;

import tictactoe.controllers.GameController;
import tictactoe.models.*;
import java.util.*;

public class Client {
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

        //start the game
        Game game = gameController.startGame(3,players,winningStrategies);
        //display the contents
        gameController.display();
        //play the game
        while(gameController.checkState().equals(GameState.INPROGRESS)){
            //make a move
            gameController.makeMove();
            gameController.display();
        }
        //check if any winner
        if(gameController.checkState().equals(GameState.WIN)){
            System.out.println("A player has won the game");
        }else if(gameController.checkState().equals(GameState.DRAW)){
            System.out.println("Game has ended in a draw");
        }

    }

}
