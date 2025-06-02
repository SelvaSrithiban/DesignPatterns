package tictactoe.strategies;

import tictactoe.models.Board;
import tictactoe.models.*;

public interface BotPlayingLevel {

    public Move makeMove(Board board, Player player);

}
