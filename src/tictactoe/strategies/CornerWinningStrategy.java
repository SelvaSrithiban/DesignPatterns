package tictactoe.strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class CornerWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        // TODO Auto-generated method stub

        int size = board.getSize();

        // Get symbols from the four corners
        char symbol1 = board.getGrid().get(0).get(0).getSymbol().getSymbol();                  // Top-left
        char symbol2 = board.getGrid().get(0).get(size - 1).getSymbol().getSymbol();           // Top-right
        char symbol3 = board.getGrid().get(size - 1).get(0).getSymbol().getSymbol();           // Bottom-left
        char symbol4 = board.getGrid().get(size - 1).get(size - 1).getSymbol().getSymbol();    // Bottom-right

        // Check if all corner symbols are the same and not empty
        if (symbol1 != '\0' && symbol1 == symbol2 && symbol2 == symbol3 && symbol3 == symbol4) {
            return true;
        }
        
        return false;
    }

}
