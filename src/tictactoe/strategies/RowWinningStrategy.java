package tictactoe.strategies;

import java.util.HashMap;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

public class RowWinningStrategy implements WinningStrategy{
    //datastructure to store the counts
    HashMap<Integer, HashMap<Character, Integer>> rowCount = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        /*//retrieve the data
        int row = move.getCell().getRow();
        Symbol symbol = move.getCell().getSymbol();

        //check if the row already exists in HashMap
        if(!rowCount.containsKey(row)){
            //Create hashmap
            rowCount.put(row, new HashMap<>());
        }

        HashMap<Character, Integer> counts = rowCount.get(row);

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

        int row = move.getCell().getRow();
        Symbol symbol = move.getCell().getSymbol();
        char sym = symbol.getSymbol();

        // Create inner map if column not tracked yet
        rowCount.putIfAbsent(row, new HashMap<>());

        // Increment the count for the symbol in this column
        HashMap<Character, Integer> counts = rowCount.get(row);
        counts.put(sym, counts.getOrDefault(sym, 0) + 1);

        // Check if the symbol count matches board size (winning condition)
        return counts.get(sym) == board.getSize();
    }

    @Override
    public void undoMove(Board board, Move move) {
        int row = move.getCell().getRow();  // ✅ Get column, not row
        Symbol symbol = move.getCell().getSymbol();
        char sym = symbol.getSymbol();

        // ✅ Check if column exists
        if (!rowCount.containsKey(row)) return;

        HashMap<Character, Integer> counts = rowCount.get(row);

        // ✅ Check if symbol exists in column
        if (!counts.containsKey(sym)) return;

        int currentCount = counts.get(sym);
        
        if (currentCount > 1) {
            counts.put(sym, currentCount - 1);
        } else {
            counts.remove(sym); // Remove symbol if count reaches 0
        }

        // ✅ Clean up empty column
        if (counts.isEmpty()) {
            rowCount.remove(row);
        }
    }

}
