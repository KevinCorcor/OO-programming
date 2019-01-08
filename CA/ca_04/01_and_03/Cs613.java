// https://dzone.com/articles/all-about-the-singleton

/*The implementation below works in case of a single-threaded environment, 
but when it comes to multithreaded systems, it can cause issues if multiple 
threads are inside the if loop at the same time. 
*/
class Cs613
{
	private static Cs613 _instance;			
	static int numObjects;
	Lecturer lec;
	
	private Cs613()
	{
		System.out.println("Cs613()");
		numObjects++;
		lec = new Lecturer();
	}

	// if multiple threads access this method(specifically the constructor call) 
	// simultaneously they will all have different instances of the singleton class.
	// This then breaks the singleton design pattern
	public static Cs613 instance()   
	{
		System.out.println("instance()");
		if(_instance==null)
		{
			_instance = new Cs613();// is not mutually exclusive in a multithreaded environment
		}
		
		return _instance;
	}
}

class Lecturer
{
	//code for Lecturer here
}