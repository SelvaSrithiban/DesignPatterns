package tictactoe.models;

import tictactoe.factory.BotPlayingStrategyFactory;
import tictactoe.strategies.BotPlayingLevel;

public class BotPlayer extends Player{
   private BotDifficultyLevel difficultyLevel;
   private BotPlayingLevel botPlayingLevel; 

   public BotPlayer(int i, String string, Symbol symbol, PlayerType type, BotDifficultyLevel difficultyLevel) {
      super(i, string, symbol, type);
      this.difficultyLevel = difficultyLevel;
      this.botPlayingLevel = BotPlayingStrategyFactory.getBot(difficultyLevel);
   }

   public BotDifficultyLevel getDifficultyLevel() {
    return difficultyLevel;
   }

   public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
   }

   @Override
   public Move makeMove(Board board) {
      // TODO Auto-generated method stub
      return botPlayingLevel.makeMove(board, this);
   }
}
