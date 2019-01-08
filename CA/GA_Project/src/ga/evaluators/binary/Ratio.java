package ga.evaluators.binary;

import ga.evaluators.Evaluator;
import ga.populations.Population;

/**
 * 
 */
public class Ratio implements Evaluator {

    /**
     * {@inheritDoc}
     */
    @Override
    public void evaluate(Population population) {
       System.out.println("evaluating fitness as a ratio");
    }
 }