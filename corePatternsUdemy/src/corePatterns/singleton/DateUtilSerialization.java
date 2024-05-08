package corePatterns.singleton;

import java.io.Serializable;

public class DateUtilSerialization implements Serializable {

	private static final long serialVersionUID = 1L;
	private static DateUtilSerialization instance;

	private DateUtilSerialization() {
		
	}

	/*
	This is Lazy Initialization. Object is created if not available only when getInstance() is called
	 */
	public static DateUtilSerialization getInstance() {
		if(instance == null) {
			instance = new DateUtilSerialization();
		}
		return instance;
	}

	//ObjectInputStream internally invokes readResolve() which should be overriden in our DateUtil class to have the same singleton behavior.
	protected Object readResolve(){
		return instance;
	}



}
