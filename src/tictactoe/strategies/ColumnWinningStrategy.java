
package tictactoe.strategies;

import java.util.HashMap;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

public class ColumnWinningStrategy implements WinningStrategy{
    //datastructure to store the counts
    HashMap<Integer, HashMap<Character, Integer>> colCount = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        /*//retrieve the data
        int col = move.getCell().getCol();
        Symbol symbol = move.getCell().getSymbol();

        //check if the row already exists in HashMap
        if(!colCount.containsKey(col)){
            //Create hashmap
            colCount.put(col, new HashMap<>());
        }

        HashMap<Character, Integer> counts = colCount.get(col);

        //check if symbol exists
        if(!counts.containsKey(symbol.getSymbol())){
            counts.put(symbol.getSymbol(), 0);
        }else{
            counts.put(symbol.getSymbol(), symbol.getSymbol()+1);
        }

        //check if row is completely filled
        if(counts.get(symbol.getSymbol()) == board.getSize()){
            return true;
        }
        return false;*/

        int col = move.getCell().getCol();
        Symbol symbol = move.getCell().getSymbol();
        char sym = symbol.getSymbol();

        // Create inner map if column not tracked yet
        colCount.putIfAbsent(col, new HashMap<>());

        // Increment the count for the symbol in this column
        HashMap<Character, Integer> counts = colCount.get(col);
        counts.put(sym, counts.getOrDefault(sym, 0) + 1);

        // Check if the symbol count matches board size (winning condition)
        return counts.get(sym) == board.getSize();
    }

    @Override
    public void undoMove(Board board, Move move) {
        // TODO Auto-generated method stub
        int col = move.getCell().getCol();
        Symbol symbol = move.getCell().getSymbol();
        char sym = symbol.getSymbol();
         
        // Check if column exists
        if (!colCount.containsKey(col)) return;
        HashMap<Character, Integer> counts = colCount.get(col);

        // Check if symbol count exists
        if (!counts.containsKey(sym)) return;

        int currentCount = counts.get(sym);
        if (currentCount > 1) {
            counts.put(sym, currentCount - 1);
        } else {
            counts.remove(sym); // Remove symbol when count is 0
        }
        
        // Optional: Clean up the entire column if it's now empty
        if (counts.isEmpty()) {
            colCount.remove(col);
        }
    }

}
