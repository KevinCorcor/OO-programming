package ga.selectors.integer;

import ga.populations.Population;
import ga.selectors.Selector;

/**
 * 
 */
public class Tournament implements Selector {
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void select(Population population) {
       System.out.println("Selecting by tournament");
    }
 }