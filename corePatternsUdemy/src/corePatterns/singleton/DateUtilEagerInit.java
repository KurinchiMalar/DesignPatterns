package corePatterns.singleton;

public class DateUtilEagerInit {

	private static DateUtilEagerInit instance = new DateUtilEagerInit();

	private DateUtilEagerInit() {
		
	}

	/*
	This is Eager initialization.
	 */
	public static DateUtilEagerInit getInstance() {
		return instance;
	}

}
