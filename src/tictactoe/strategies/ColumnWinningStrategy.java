
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
        //retrieve the data
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
        return false;
    }

}
