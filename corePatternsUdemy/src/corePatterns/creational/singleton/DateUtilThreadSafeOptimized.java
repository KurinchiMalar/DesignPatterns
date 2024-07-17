package corePatterns.creational.singleton;

public class DateUtilThreadSafeOptimized {

	/*  Read more: https://javarevisited.blogspot.com/2011/06/volatile-keyword-java-example-tutorial.html#ixzz8ZcXUg51K

	Write to a volatile field will happen before any read operation. - best bet for multithreaded environments

    Why do you need mark a singleton instance volatile ?
    	The real problem is that Thread A may assign a memory space for instance before it is finished constructing instance.
    	Thread B will see that assignment and try to use it.
    	This results in Thread B failing because it is using a partially constructed version of instance.

	 */
	private static volatile DateUtilThreadSafeOptimized instance;

	private DateUtilThreadSafeOptimized() {
		
	}
	/*
		we dont need the lock if the object is already created
	 */
	public static DateUtilThreadSafeOptimized getInstance() {
		//synchronized block
		//Double checked locking
		if(instance == null){

			synchronized (DateUtilThreadSafeOptimized.class) { // class level lock
				if(instance == null) {
					instance = new DateUtilThreadSafeOptimized();
				}
			}

		}

		return instance;
	}

}
