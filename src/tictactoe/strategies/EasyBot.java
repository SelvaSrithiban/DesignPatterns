package tictactoe.strategies;

import java.util.List;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.CellState;
import tictactoe.models.Move;
import tictactoe.models.Player;

public class EasyBot implements BotPlayingLevel{

    @Override
    public Move makeMove(Board board, Player player) {
        // TODO Auto-generated method stub
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    //cell.setCellState(CellState.OCCUPIED);
                    //cell.setSymbol(player.getSymbol());
                    return new Move(cell, player);
                }
            }
        }
        return null;
    }

}
