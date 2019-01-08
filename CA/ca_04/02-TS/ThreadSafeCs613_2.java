// source: https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/


// WAY THREE (BILL PUGH)
class ThreadSafeCs613_2
{
	//private static ThreadSafeCs613_2 _instance;			
	static int numObjects;
	Lecturer lec;
	
	private ThreadSafeCs613_2()
	{
		System.out.println("ThreadSafeCs613_2()");
		numObjects++;
		lec = new Lecturer();
	}

	// WAY THREE (BILL PUGH)
	// avoid using synchronization by using a subclass which is not loaded until called by instance3()
	// lazy initialisation like the other ways above 
	private static  class TSCs613{
        
		private static final ThreadSafeCs613_2 __instance = new ThreadSafeCs613_2();
	}

	public static ThreadSafeCs613_2 instance3(){
		return TSCs613.__instance;
	}
}
