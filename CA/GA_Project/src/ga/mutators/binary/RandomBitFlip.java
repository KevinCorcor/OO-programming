package ga.mutators.binary;

import ga.mutators.Mutator;
import ga.populations.Population;

/**
 * Based on the mutation method of flipping a random genome bit.
 */
public class RandomBitFlip implements Mutator{
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void mutate(Population population) {
       System.out.println("Flipping random genome bit");
    }
}