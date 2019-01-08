package ga.mutators;

import ga.populations.Population;

/**
 * 
 */
public interface Mutator {
   
    /**
     * @param population - Population
     */
    public void mutate(Population population);
 }