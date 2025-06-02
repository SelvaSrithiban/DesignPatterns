package tictactoe.controllers;

import java.util.List;

import tictactoe.exceptions.InvalidMoveException;
import tictactoe.strategies.*;
import tictactoe.models.*;


public class GameController {

    public Game startGame(int size, List<Player> players,List<WinningStrategy> winningStrategies){
        return Game
                .getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void display(Game game){
        game.display();
    }

    public GameState checkState(Game game){
        return game.getCurrentState();
    }

    public void makeMove(Game game){
        try{
            game.makeMove(game);
        }catch(InvalidMoveException e){
            System.out.println(e.getMessage());
        }
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undoMove(Game game){
        game.undoMove(game);
    }

}
