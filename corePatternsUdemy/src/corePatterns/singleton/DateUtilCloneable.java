package corePatterns.singleton;

import java.io.Serializable;

public class DateUtilCloneable implements Serializable,Cloneable {

	private static final long serialVersionUID = 1L;
	private static DateUtilCloneable instance;

	private DateUtilCloneable() {

	}

	/*
	This is Lazy Initialization. Object is created if not available only when getInstance() is called
	 */
	public static DateUtilCloneable getInstance() {
		if(instance == null) {
			instance = new DateUtilCloneable();
		}
		return instance;
	}

	//ObjectInputStream internally invokes readResolve() which should be overriden in our DateUtil class to have the same singleton behavior.
	protected Object readResolve(){
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone(); ---> if any child class does of this class does a super.clone() we are exposing the ablility to clone the singleton instance. This should be blocked.

		throw new CloneNotSupportedException();

	}


}
