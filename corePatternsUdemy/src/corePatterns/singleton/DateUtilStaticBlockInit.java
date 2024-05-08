package corePatterns.singleton;

public class DateUtilStaticBlockInit {

	private static DateUtilStaticBlockInit instance;

	//static blocks are executed when the class is loaded to memory.
	static {
		instance = new DateUtilStaticBlockInit();
	}
	private DateUtilStaticBlockInit() {
		
	}

	/*
	This is Eager initialization.
	 */
	public static DateUtilStaticBlockInit getInstance() {
		return instance;
	}

}
