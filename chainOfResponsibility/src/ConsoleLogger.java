public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    public void log(String message, int level) {
        if(level >= this.level) {
            System.out.println("CONSOLE::" + message);
        }
        next(message, level);
    }
}
