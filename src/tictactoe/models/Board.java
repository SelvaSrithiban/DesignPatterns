package tictactoe.models;

import java.util.*;

public class Board {
    private int size;
    private List<List<Cell>> grid;

    Board(int size){
        this.size = size;
        this.grid = new ArrayList<>();
        //create 2D arraylist of sizeXsize
        for(int i = 0; i < size; i++){
            grid.add(new ArrayList<>());
            for(int j = 0; j < size; j++){
                grid.get(i).add(new Cell(i,j));
            }
        }

    }

    public void displayBoard(){
        for(List<Cell> row : grid){
            for(Cell cell : row){
                cell.display();
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public List<List<Cell>>  getGrid() {
        return grid;
    }
    public void setGrid(List<List<Cell>>  grid) {
        this.grid = grid;
    }


}
