package factories.binary;

import factories.GeneticAlgorithmFactory;
import ga.populations.Population;
import ga.populations.binary.*;
import ga.evaluators.Evaluator;
import ga.evaluators.binary.*;
import ga.mutators.Mutator;
import ga.mutators.binary.*;
import ga.reproducers.Reproducer;
import ga.reproducers.binary.*;
import ga.selectors.*;
import ga.selectors.binary.*;
import ga.selectors.integer.*;

/**
 *  Binary implementation of the abstract Genetic_Algorithm_Factory class
 */
public class Binary_GA_Factory extends GeneticAlgorithmFactory {

	private static Binary_GA_Factory _instance;
	
	/**
	 * private empty constructor
	 */
	private Binary_GA_Factory() {
		
	}
	
	/**
	 * Singleton Pattern for returning the Factory instance
	 * 
	 * @return GeneticAlgorithmFactory
	 */
	public static GeneticAlgorithmFactory getBinaryFactory() {
		
		if(_instance==null) {
			// multiple threads can not access this guard simultaneously,
			// thus performance is only affected once. 
			// lazy initialisation
			synchronized (Binary_GA_Factory.class) { 
				
				if(_instance==null) {
					_instance = new Binary_GA_Factory();
				}
			}
		}
		System.out.println("Getting Binary GA Factory: " + _instance);
		return _instance;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Population getPopulation() {
		return new BinaryPopulation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Evaluator getEvaluator(String evaluator) {

		switch(evaluator) {
		case "Length":
			return new Length();
		case "Ratio":
			return new Ratio();
		default:
			System.out.print("no Evaluator was set. \nPlease ensure the specified Evaluator is an Binary Type");
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Selector getSelector(String selector) {

		switch(selector) {
		case "Tournament":
			return new Tournament();
		case "Random":
			return new Random();
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

		switch(reproducer) {
		case "TwoPoint":
			return new TwoPoint();
		case "SinglePoint":
			return new SinglePoint();
		case "UniformPoint":
			return new UniformPoint();
		default:
			System.out.print("no Reproducer was set. \nPlease ensure the specified Reproducer is an Integer Type");
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Mutator getMutator(String mutator) {

		switch(mutator) {
		case "RandomBitFlip":
			return new RandomBitFlip();
		default:
        	System.out.print("no Mutator was set. \nPlease ensure the specified Reproducer is an Integer Type");
			return null;
		}
	}
}