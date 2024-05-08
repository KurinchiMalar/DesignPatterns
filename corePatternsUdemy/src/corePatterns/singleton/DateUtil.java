package corePatterns.singleton;

public class DateUtil {
	
	private static DateUtil instance;
	
	private DateUtil() {
		
	}
	
	public DateUtil getInstance() {
		if(instance == null) {
			instance = new DateUtil();
		}
		return instance;
	}

}
