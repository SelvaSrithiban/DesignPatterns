package tictactoe.models;

import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(int i, String string, Symbol symbol, PlayerType type) {
        super(i, string, symbol, type);
        //TODO Auto-generated constructor stub
    }

    public Move makeMove(Board board){

        System.out.println("Please enter the row in which you want to place the symbol");
        int r = scanner.nextInt();
        System.out.println("Please enter the column in which you want to place the symbol");
        int c = scanner.nextInt();

        return new Move(new Cell(r , c) , this);
    }

}
