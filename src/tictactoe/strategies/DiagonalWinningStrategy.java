package tictactoe.strategies;

import java.util.HashMap;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

public class DiagonalWinningStrategy implements WinningStrategy{
    HashMap<Character, Integer> mainDiagonalCount = new HashMap<>();
    
    // HashMap to store counts for anti-diagonal (top-right to bottom-left)
    HashMap<Character, Integer> antiDiagonalCount = new HashMap<>();
    
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getCell().getSymbol();
        char sym = symbol.getSymbol();
        int boardSize = board.getSize();
        
        boolean isWinner = false;
        
        // Check if the move is on the main diagonal (row == col)
        if (row == col) {
            mainDiagonalCount.put(sym, mainDiagonalCount.getOrDefault(sym, 0) + 1);
            if (mainDiagonalCount.get(sym) == boardSize) {
                isWinner = true;
            }
        }
        
        // Check if the move is on the anti-diagonal (row + col == boardSize - 1)
        if (row + col == boardSize - 1) {
            antiDiagonalCount.put(sym, antiDiagonalCount.getOrDefault(sym, 0) + 1);
            if (antiDiagonalCount.get(sym) == boardSize) {
                isWinner = true;
            }
        }
        
        return isWinner;
    }

    @Override
    public void undoMove(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getCell().getSymbol();
        char sym = symbol.getSymbol();
        int boardSize = board.getSize();

        // Undo move on main diagonal if the move was on it
        if (row == col && mainDiagonalCount.containsKey(sym)) {
            int currentCount = mainDiagonalCount.get(sym);
            if (currentCount > 1) {
                mainDiagonalCount.put(sym, currentCount - 1);
            } else {
                mainDiagonalCount.remove(sym); // Clean up if count is 0
            }
        }

        // Undo move on anti-diagonal if the move was on it
        if ((row + col == boardSize - 1) && antiDiagonalCount.containsKey(sym)) {
            int currentCount = antiDiagonalCount.get(sym);
            if (currentCount > 1) {
                antiDiagonalCount.put(sym, currentCount - 1);
            } else {
                antiDiagonalCount.remove(sym); // Clean up if count is 0
            }
        }
    }

}
