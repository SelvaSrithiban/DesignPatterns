package tictactoe.strategies;

import tictactoe.models.*;

public class CornerWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        int size = board.getSize();

    Cell topLeft = board.getGrid().get(0).get(0);
    Cell topRight = board.getGrid().get(0).get(size - 1);
    Cell bottomLeft = board.getGrid().get(size - 1).get(0);
    Cell bottomRight = board.getGrid().get(size - 1).get(size - 1);

    // Ensure all 4 corners are OCCUPIED
    if (topLeft.getCellState() == CellState.OCCUPIED &&
        topRight.getCellState() == CellState.OCCUPIED &&
        bottomLeft.getCellState() == CellState.OCCUPIED &&
        bottomRight.getCellState() == CellState.OCCUPIED) {

        char symbol1 = topLeft.getSymbol().getSymbol();
        char symbol2 = topRight.getSymbol().getSymbol();
        char symbol3 = bottomLeft.getSymbol().getSymbol();
        char symbol4 = bottomRight.getSymbol().getSymbol();

        if (symbol1 == symbol2 && symbol2 == symbol3 && symbol3 == symbol4) {
            return true;
        }
    }

    return false;

}

}
