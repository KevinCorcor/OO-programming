package factories.integer;

import factories.GeneticAlgorithmFactory;
import ga.evaluators.Evaluator;
import ga.selectors.Selector;
import ga.reproducers.Reproducer;
import ga.mutators.Mutator;
import ga.evaluators.integer.*;
import ga.selectors.integer.*;
import ga.reproducers.integer.*;
import ga.mutators.integer.*;
import ga.populations.Population;
import ga.populations.integer.IntegerPopulation;

/**
 * Integer implementation of the abstract Genetic_Algorithm_Factory class
 */
public class Integer_GA_Factory extends GeneticAlgorithmFactory {

	private static Integer_GA_Factory _instance;
	
	/**
	 * Private constructor
	 */
	private Integer_GA_Factory() {

	}

	/**
	 * Singleton Pattern for returning the Factory instance
	 * 
	 * @return GeneticAlgorithmFactory
	 */
	public static GeneticAlgorithmFactory getIntegerFactory() {
		
		if(_instance==null) {
			
			// multiple threads can not access this guard simultaneously,
			// thus performance is only affected once. 
			// lazy initialisation
			synchronized (Integer_GA_Factory.class) { 
				if(_instance==null) {
					_instance = new Integer_GA_Factory();
				}
			}
		}
		System.out.println("Getting Binary GA Factory: " + _instance);

		return _instance;
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public Population getPopulation() {
		return new IntegerPopulation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Evaluator getEvaluator(String evaluator) {

		switch (evaluator) {
		case "Rank":
			return new Rank();
		default:
			System.out.print("no Evaluator was set. \nPlease ensure the specified Evaluator is an Integer type");
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Selector getSelector(String selector) {

		switch (selector) {
		case "Tournament":
			return new Tournament();
		case "RouletteWheel":
			return new RouletteWheel();
		default:
			System.out.print("no Selector was set. \nPlease ensure the specified Selector is an Integer Type");
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Reproducer getReproducer(String reproducer) {

		switch (reproducer) {
		case "Multiply":
			return new Multiply();
		default:
			System.out.print("no Mutator was set. \nPlease ensure the specified Reproducer is an Integer Type");
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Mutator getMutator(String mutator) {

		switch (mutator) {
		case "Boundary":
			return new Boundary();
		default:
			System.out.print("no Mutator was set. \nPlease ensure the specified Reproducer is an Integer Type");
			return null;
		}
	}
}