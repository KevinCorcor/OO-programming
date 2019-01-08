package ga.selectors;

import ga.populations.Population;

/**
 * 
 */
public interface Selector {
    
    /**
     * Select the fittest individuals of the specified population
     * 
     * @param population - Population
     */
    public void select(Population population);
}