package corePatterns.singleton;

public class DateUtilThreadSafe {

	private static DateUtilThreadSafe instance;

	private DateUtilThreadSafe() {
		
	}
	/*
	2 ways
	1) add synchronized keyword to the method.
				public static synchronized DateUtilThreadSafe getInstance() {....}

	2) better way is to add the block of code within synchronized block
	 */
	public static DateUtilThreadSafe getInstance() {
		//synchronized block
		synchronized (DateUtilThreadSafe.class) { // class level lock
		if(instance == null) {
			instance = new DateUtilThreadSafe();
		}
		}
		return instance;
	}

}
