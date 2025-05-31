package tictactoe.models;

public class Board {
    private int size;
    private Symbol[][] grid;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Symbol[][] getGrid() {
        return grid;
    }
    public void setGrid(Symbol[][] grid) {
        this.grid = grid;
    }
}
