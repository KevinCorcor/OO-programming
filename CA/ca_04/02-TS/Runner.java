
class Runner
{
	public static void main(String[] args)
	{
		//ThreadSafe613 dealer = new ThreadSafeCs613(); //won't compile? why not?
		System.out.println("Call instance1() first time");
		ThreadSafeCs613 module1 = ThreadSafeCs613.instance1();
		System.out.println("ThreadSafeCs613.numObjects = "+ThreadSafeCs613.numObjects+", module1:"+module1+"\n");
		
		System.out.println("Call instance1() second time");
		ThreadSafeCs613 module2 = ThreadSafeCs613.instance1();
		System.out.println("ThreadSafeCs613.numObjects = "+ThreadSafeCs613.numObjects+", module2:"+module2+"\n");
		
		//ThreadSafeCs613 dealer = new ThreadSafeCs613(); //won't compile? why not?
		System.out.println("Call instance2() first time");
		ThreadSafeCs613 module3 = ThreadSafeCs613.instance2();
		System.out.println("ThreadSafeCs613.numObjects = "+ThreadSafeCs613.numObjects+", module3:"+module3+"\n");
		
		System.out.println("Call instance2() second time");
		ThreadSafeCs613 module4 = ThreadSafeCs613.instance2();
		System.out.println("ThreadSafeCs613.numObjects = "+ThreadSafeCs613.numObjects+", module4:"+module4+"\n");

		//The Bill Pugh method is implemented in the ThreadSafeCs613_2 class.
		System.out.print("The Bill Pugh ");
		System.out.print("###################");

		System.out.println("Call instance3() first time");
		ThreadSafeCs613_2 module5 = ThreadSafeCs613_2.instance3();
		System.out.println("ThreadSafeCs613_2.numObjects = "+ThreadSafeCs613_2.numObjects+", module5:"+module5+"\n");

		System.out.println("Call instance3() second time");
		ThreadSafeCs613_2 module6 = ThreadSafeCs613_2.instance3();
		System.out.println("ThreadSafeCs613_2.numObjects = "+ThreadSafeCs613_2.numObjects+", module4:"+module6);
	}
}