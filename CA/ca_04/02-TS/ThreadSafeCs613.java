// source: https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/


class ThreadSafeCs613
{
	private static ThreadSafeCs613 _instance;			
	static int numObjects;
	Lecturer lec;
	
	private ThreadSafeCs613()
	{
		System.out.println("ThreadSafeCs613()");
		numObjects++;
		lec = new Lecturer();
	}

	// WAY ONE
	// mulitple threads can not access this method simultaneously due to the synchronization
	// regular singleton code doesn't have this synchronization 
	// and thus several threads may access this method simultaneously creating multiple instances(objects) of this class
	// lazy initialisation
	synchronized public static ThreadSafeCs613 instance1()   
	{
		System.out.println("instance()1");
		if(_instance==null)
		{
			_instance = new ThreadSafeCs613();
		}
		
		return _instance;
	}
	// WAY TWO

	public static ThreadSafeCs613 instance2()   
	{
		if(_instance==null)
		{
			// multiple threads can not access this guard simultaneously,
			// thus performance is only affected once. 
			// lazy initialisation
			synchronized (ThreadSafeCs613.class) 
			{ 
				System.out.println("instance()2");
				if(_instance==null)
				{
					_instance = new ThreadSafeCs613();
				}
			}
		}
		return _instance;
	}

	// WAY THREE (BILL PUGH)
	//Seperate file	
}

class Lecturer
{
	//code for Lecturer here
}