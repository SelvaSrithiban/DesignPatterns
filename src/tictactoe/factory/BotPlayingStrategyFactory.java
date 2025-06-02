package tictactoe.factory;

import tictactoe.models.BotDifficultyLevel;
import tictactoe.strategies.BotPlayingLevel;
import tictactoe.strategies.EasyBot;
import tictactoe.strategies.HardBot;
import tictactoe.strategies.MediumBot;

public class BotPlayingStrategyFactory {

    public static BotPlayingLevel getBot(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBot();
        }else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
            return new MediumBot();
        }else if(botDifficultyLevel.equals(BotDifficultyLevel.HARD)){
            return new HardBot();
        }else{
            return null;
        }
    }

}
