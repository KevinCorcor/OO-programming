package ga.evaluators;

import ga.populations.Population;
/**
 * 
 */
public interface Evaluator {
    /**
     * This method executes the fitness function on the population.
     * 
     * @param population - Population
     */
    public void evaluate(Population population);
 }