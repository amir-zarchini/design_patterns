public class ChainDemo {

    public static void main(String[] args) {

        FileLogger fileLogger = new FileLogger(LoggerHandler.INFO);
        ConsoleLogger consoleLogger = new ConsoleLogger(LoggerHandler.DEBUG);

        String message = "my log";

        fileLogger.log(message, LoggerHandler.ERROR);
        consoleLogger.log(message, LoggerHandler.ERROR);

        System.out.println();

        LoggerHandler logger = new FileLogger(LoggerHandler.INFO)
                .setNext(new ConsoleLogger(LoggerHandler.DEBUG)
                        .setNext(new FileLogger(LoggerHandler.DEBUG)));
        logger.log(message, LoggerHandler.ERROR);

    }
}
