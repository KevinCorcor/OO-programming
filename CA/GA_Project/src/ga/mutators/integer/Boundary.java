package ga.mutators.integer;

import ga.mutators.Mutator;
import ga.populations.Population;

/**
 * Based on the mutation method of replacing the genome with either lower or upper bound randomly
 */
public class Boundary implements Mutator{
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void mutate(Population population) {
       System.out.println("performing a boundary mutation");
    }
}