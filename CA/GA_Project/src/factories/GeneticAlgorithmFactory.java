package factories;

import ga.populations.Population;
import ga.evaluators.Evaluator;
import ga.selectors.Selector;
import ga.reproducers.Reproducer;
import ga.mutators.Mutator;

/**
 * The abstract class outlining the core methods of the Factories
 * 
 */
public abstract class GeneticAlgorithmFactory {

	/**
	 * gets the population
	 * 
	 * @return population
	 */
	public abstract Population getPopulation();

	/**
	 * get the specified Evaluator
	 * 
	 * @param evaluator - String
	 * @return Evaluator
	 */
	public abstract Evaluator getEvaluator(String evaluator);

	/**
	 * get the specified Selector
	 * 
	 * @param selector - String
	 * @return Selector 
	 */
	public abstract Selector getSelector(String selector);

	/**
	 * get the specified Reproducer
	 * 
	 * @param reproducer - String
	 * @return Reproducer 
	 */
	public abstract Reproducer getReproducer(String reproducer);

	/**
	 * get the specified Mutator
	 * 
	 * @param mutator - String
	 * @return Mutator
	 */
	public abstract Mutator getMutator(String mutator);

}