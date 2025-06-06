package tictactoe.strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;

public interface WinningStrategy {

    public boolean checkWinner(Board board, Move move);

    public void undoMove(Board board, Move move);
    
}
