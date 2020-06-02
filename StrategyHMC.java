package game_theory_bimatrix;

public class StrategyHMC implements Strategy {
    /**
    *
    * @param initStrategy - an initial set of probabilities for each strategy
    * @param game - the game being played
    * @param player - whether I am player 1 or player 2
    */
    public StrategyHMC(double[] initStrategy, Game game, int player) {
        // TO DO: Complete this constructor
    }
    
    @Override
    public int chooseAction() {
        // TO DO: Complete this method
        return 0;
    }

    @Override
    public void update(Game game, int myAction, int otherAction, int player) {
        // TO DO: Complete this method
    }
    
    @Override
    public double[] getStrategy() {
        // TO DO: Complete this method
        return null;
    }
}