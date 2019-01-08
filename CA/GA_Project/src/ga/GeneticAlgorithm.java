package ga;

import ga.populations.Population;
import ga.evaluators.Evaluator;
import ga.mutators.Mutator;
import ga.selectors.Selector;
import ga.reproducers.Reproducer;
import factories.GeneticAlgorithmFactory;
import factories.binary.Binary_GA_Factory;
import factories.integer.Integer_GA_Factory;

/**
 * 
 */
public class GeneticAlgorithm {

	private GeneticAlgorithmFactory ga_factory;
	private Population population;
	private Evaluator evaluator;
	private Selector selector;
	private Reproducer reproducer;
	private Mutator mutator;

	/**
	 * Genetic Algorithm constructor
	 * 
	 * @param factory -String : refers to the type of factory which will produce the steps of
	 *             	 the GA
	 */
	public GeneticAlgorithm(String factory) {
		
		switch (factory) {
		case "Integer":
			this.ga_factory = Integer_GA_Factory.getIntegerFactory();
			break;
		case "Binary":
			this.ga_factory = Binary_GA_Factory.getBinaryFactory();
			break;
		default:
			System.out.println("No factory s");
		}
	}

	/**
	 * Initialise a population. 
	 * This is determined given the type of Genetic Algorithm Factory instantiated.
	 *
	 */
	public void setPopulation() {
		if (this.population == null) {
			this.population = ga_factory.getPopulation();
		} else {			
			System.out.println("*** Changing Population ***");			
			this.population = ga_factory.getPopulation();
		}
	}

	/**
	 * Uses the factory set in the consrtuctor to set a specific Evaluator
	 * 
	 * @param evaluator - Evaluator
	 */
	public void setEvaluator(String evaluator) {
		if (this.evaluator == null) {
			this.evaluator = ga_factory.getEvaluator(evaluator);
		} else {
			System.out.println("*** Changing Evaluator ***");
			this.evaluator = ga_factory.getEvaluator(evaluator);
		}
	}
	
	/**
	 * Uses the factory set in the consrtuctor to set a specific Selector
	 * 
	 * @param selector - Selector
	 */
	public void setSelector(String selector) {
		
		if (this.selector ==null) {
			this.selector = ga_factory.getSelector(selector);
		} else {
			System.out.println("*** Changing Selector ***");
			this.selector = ga_factory.getSelector(selector);
		}
	}
	
	/**
	 * Uses the factory set in the consrtuctor to set a specific Reproducer
	 * 
	 * @param reproducer - Reproducer
	 */
	public void setReproducer(String reproducer) {
		if (this.reproducer == null) {
			this.reproducer = ga_factory.getReproducer(reproducer);
		} else {
			System.out.println("*** Changing Reproducer ***");
			this.reproducer = ga_factory.getReproducer(reproducer);
		}
	}

	/**
	 * Uses the factory set in the consrtuctor to set a specific Mutator
	 * 
	 * @param mutator - Mutator
	 */
	public void setMutator(String mutator) {
		
		if (this.mutator == null) {
			this.mutator = ga_factory.getMutator(mutator);
		} else {
			System.out.println("*** Changing Mutator ***");
			this.mutator = ga_factory.getMutator(mutator);

		}
	}
	
	/**
	 * run the full algorithm
	 * 
	 * @param iterations - int: no. of trials
	 */
	public void runGA(int iterations) {
		int iteration = 0;
		do {
			System.out.println("Iteration :" + iteration);
			System.out.print("\t");
			runEvaluator();
			System.out.print("\t");
			runSelector();
			System.out.print("\t");
			runReproducer();
			System.out.print("\t");
			runMutator();
			iteration++;
		}while (iteration < iterations);
	}
	/**
	 * print the current population
	 */
	public void printPopulation() {
		System.out.println(this.population);
	}
	
	/**
	 * execute Evaluator
	 */
	public void runEvaluator() {
		if (evaluator != null) {
			System.out.println(this.getClass() + "@" +this.hashCode()+": Running Evaluator: " + this.evaluator);
			System.out.print("\t");
			this.evaluator.evaluate(this.population);
		} else {
			System.out.println("########## No Evaluator has been set. ##########");
		}
	}

	/**
	 * Runs the set selector for the specified Genetic Algorithm
	 */
	public void runSelector() {
		if (selector != null) {
			System.out.println(this.getClass() + "@" +this.hashCode()+": Running Selector: " + this.selector);
			System.out.print("\t");
			this.selector.select(this.population);
		} else {
			System.out.println("########## No Selector has been set. ##########");
		}
	}	
	
	/**
	 * execute reproducer
	 */
	public void runReproducer() {
		
		if (reproducer != null) {
			System.out.println(this.getClass() + "@" +this.hashCode()+": Running Reproducer: " + this.reproducer);
			System.out.print("\t");
			this.reproducer.reproduce(this.population);
		} else {
			System.out.println("########## No Reproducer has been set. ##########");
		}
	}
	
	/**
	 * execute mutator
	 */
	public void runMutator() {
		if (mutator != null) {
			System.out.println(this.getClass() + "@" +this.hashCode()+": Running Mutator: " + this.mutator);
			System.out.print("\t");
			this.mutator.mutate(this.population);
		} else {
			System.out.println("########## No Mutator has been set. ##########");

		}
	}
	
	/**
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		
		String ga = "\nGA: " + this.getClass().getName() + "@" + this.getClass().hashCode() + "{\t" + "\n\t" + "Poputlation: " + this.population + "\n\t" + "Evaluator: " + this.evaluator + "\n\t" +  "Selector: " + this.selector + "\n\t" + "Reproducer: " + this.reproducer + "\n\t" + "Mutator: " + this.mutator + "\n}\n";
		return ga;
	}
}