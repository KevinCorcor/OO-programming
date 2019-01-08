package ga.reproducers;

import ga.populations.Population;

/**
 * 
 */
public interface Reproducer {
    
    /**
     * Perform reproduction on the given population
     * 
     * @param population - Population
     */
    public void reproduce(Population population);
 }