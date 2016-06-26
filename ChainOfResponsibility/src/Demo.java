import java.util.List;

/**
 * Created by kurinchimalar on 26/6/16.
 */

public class Demo {

    public static AbstractLogger getLoggerChain(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args){

        AbstractLogger loggerChain = getLoggerChain();
        loggerChain.logMessage(AbstractLogger.INFO,"This is info");
        System.out.println("--------------------------------------------");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is debug");
        System.out.println("--------------------------------------------");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is error");
    }
}
