package ga.reproducers.binary;

import ga.reproducers.Reproducer;
import ga.populations.Population;

/**  
 *  
 */
public class TwoPoint implements Reproducer{
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void reproduce(Population population) {
        System.out.println("running Two Point crossover");
    }
}