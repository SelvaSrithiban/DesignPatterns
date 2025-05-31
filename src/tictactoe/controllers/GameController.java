package tictactoe.controllers;

import java.util.List;

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

    public void display(){

    }

    public GameState checkState(){
        return GameState.INPROGRESS;
    }

    public void makeMove(){

    }

}
