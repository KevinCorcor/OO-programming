package ga.selectors.integer;

import ga.populations.Population;
import ga.selectors.Selector;

/**
 * 
 */
public class RouletteWheel implements Selector {

    /**
     * {@inheritDoc}
     */
    @Override
    public void select(Population population) {
       System.out.println("Selecting by roulette wheel");
    }
 }