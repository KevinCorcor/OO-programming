package ga.reproducers.binary;

import ga.reproducers.Reproducer;
import ga.populations.Population;

/**
 * 
 */
public class UniformPoint implements Reproducer {
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void reproduce(Population population) {
        System.out.println("running Uniform Point crossover");
    }
}