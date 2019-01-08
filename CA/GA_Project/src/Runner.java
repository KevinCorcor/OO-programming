import ga.GeneticAlgorithm;

/**
 *  
 */
public class Runner {
	
    public static void main(String[] args) {
        
    	boolean MultiThreadedEnvironment = false;
    	
    	// Create Thread 1
    	Thread thread1 = new Thread () {
    		
    		public void run () {
    			
    			// Create GeneticAlgorithm Object
    			GeneticAlgorithm gaB_1 = new GeneticAlgorithm("Binary");
		    	System.out.println(gaB_1);
		    	
    	    	// Initialise GeneticAlgorithm
		    	gaB_1.setPopulation();
		    	gaB_1.setEvaluator("Length");
		    	gaB_1.setSelector("Random");
		    	gaB_1.setReproducer("SinglePoint");
		    	gaB_1.setMutator("RandomBitFlip");
		    	System.out.println(gaB_1);
		    	
		    	// run GA
		    	gaB_1.runGA(2);
		    	System.out.println(gaB_1);
		    	
		    	//Utilise Strategy pattern
		    	gaB_1.setEvaluator("Ratio");
		    	System.out.println(gaB_1);
		    	
		    	// run GA
		    	gaB_1.runGA(1);
		    	System.out.println(gaB_1);
    	    	
				/* ############################################################### */
					
				// Create GeneticAlgorithm Object
				GeneticAlgorithm gaI_2 = new GeneticAlgorithm("Integer");
				System.out.println(gaI_2);
				
				// Initialise GeneticAlgorithm
				gaI_2.setPopulation();
				gaI_2.setEvaluator("Rank");
				gaI_2.setSelector("Tournament");
				gaI_2.setReproducer("Multiply");
				gaI_2.setMutator("Boundary");
				System.out.println(gaI_2);
				
				// run custom GA
				int iterations = 2;
				int iteration = 0;
				do{
					gaI_2.runEvaluator();
					gaI_2.printPopulation();
					gaI_2.runSelector();
					
					// Customisation example
					gaI_2.setSelector("RouletteWheel");
					gaI_2.runSelector();
					gaI_2.setSelector("Tournament");

					gaI_2.printPopulation();
					gaI_2.runReproducer();
					gaI_2.printPopulation();
					gaI_2.runMutator();
					gaI_2.printPopulation();

					iteration ++;
				}while (iteration<iterations);

				System.out.println(gaI_2);
				
				//Utilise Strategy pattern
		    	gaI_2.setSelector("RouletteWheel");
		    	System.out.println(gaI_2);
		    	
		    	// run GA
		    	gaI_2.runGA(1);
		    	System.out.println(gaI_2);
		    	
		    	if (!MultiThreadedEnvironment) {
		    		System.out.println("###### DONE ######");
		    	}
    		}
    	};
    	
    	/* #############################################################################
    	 * ############################################################################# */
    	 
    	// Create Thread 2
    	Thread thread2 = new Thread () {
    		
    		public void run () {
		    
    	    	// Create GeneticAlgorithm Object
    			GeneticAlgorithm gaI_1 = new GeneticAlgorithm("Integer");
    			System.out.println(gaI_1);
    			
    			// Initialise GeneticAlgorithm
    			gaI_1.setPopulation();
    			gaI_1.setEvaluator("Rank");
    	    	gaI_1.setSelector("RouletteWheel");
    	    	gaI_1.setReproducer("Multiply");
    	    	gaI_1.setMutator("Boundary");
    	    	System.out.println(gaI_1);
    	    	
    	    	// run GA
    	    	gaI_1.runGA(2);
    	    	System.out.println(gaI_1);
    	    	
    	    	//Utilise Strategy pattern
		    	gaI_1.setSelector("Tournament");
		    	System.out.println(gaI_1);
		    	
		    	// run GA
		    	gaI_1.runGA(1);
		    	System.out.println(gaI_1);
		    	
    	    	/* ############################################################### */

		    	
		    	// Create GeneticAlgorithm Object
		    	GeneticAlgorithm gaB_2 = new GeneticAlgorithm("Binary");
		    	System.out.println(gaB_2);
		    	
    	    	// Initialise GeneticAlgorithm
		    	gaB_2.setPopulation();
		    	gaB_2.setEvaluator("Ratio");
		    	gaB_2.setSelector("Random");
		    	gaB_2.setReproducer("TwoPoint");
		    	gaB_2.setMutator("RandomBitFlip");
		    	System.out.println(gaB_2);
		    	
		    	// run GA
		    	gaB_2.runGA(2);
		    	System.out.println(gaB_2);
		    	
		    	//Utilise Strategy pattern
		    	gaB_2.setReproducer("UniformPoint");
		    	System.out.println(gaB_2);

		    	
		    	// run GA
		    	gaB_2.runGA(1);
		    	System.out.println(gaB_2);
		    	
		    	System.out.println("###### DONE ######");

		    }
    	};
    
    	thread1.start();
    	if (MultiThreadedEnvironment) {
    		thread2.start();
       	}
    	
    	
    	    	

    	
    }
}