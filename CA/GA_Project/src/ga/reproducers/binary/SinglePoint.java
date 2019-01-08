package ga.reproducers.binary;

import ga.reproducers.Reproducer;
import ga.populations.Population;

/**
 * 
 */
public class SinglePoint implements Reproducer{
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void reproduce(Population population) {
       System.out.println("running Single Point crossover");
    }
 }