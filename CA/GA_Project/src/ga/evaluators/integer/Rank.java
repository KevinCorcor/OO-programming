package ga.evaluators.integer;

import ga.evaluators.Evaluator;
import ga.populations.Population;

/**
 * 
 */
public class Rank implements Evaluator {
   
    /**
     * {@inheritDoc}
     */
    @Override
    public void evaluate(Population population) {
       System.out.println("evaluating fitness as a rank amongst other chromosomes");
    }
 }