package corePatterns.creational.singleton;

public class DateUtilLazyInit {
	
	private static DateUtilLazyInit instance;
	
	private DateUtilLazyInit() {
		
	}

	/*
	This is Lazy Initialization. Object is created if not available only when getInstance() is called
	 */
	public static DateUtilLazyInit getInstance() {
		if(instance == null) {
			instance = new DateUtilLazyInit();
		}
		return instance;
	}

}
