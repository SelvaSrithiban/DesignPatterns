package tictactoe.models;

public class BotPlayer extends Player{
   private BotDifficultyLevel difficultyLevel;

   public BotPlayer(int i, String string, Symbol symbol, PlayerType type, BotDifficultyLevel difficultyLevel) {
      super(i, string, symbol, type);
      this.difficultyLevel = difficultyLevel;
      //TODO Auto-generated constructor stub
   }

   public BotDifficultyLevel getDifficultyLevel() {
    return difficultyLevel;
   }

   public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
   }
}
