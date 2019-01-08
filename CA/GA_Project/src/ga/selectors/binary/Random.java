package ga.selectors.binary;

import ga.selectors.Selector;
import ga.populations.Population;

/**
 * 
 */
public class Random implements Selector {

    /**
     * {@inheritDoc}
     */
    @Override
    public void select(Population population) {
       System.out.println("Selecting by random");
    }
 }