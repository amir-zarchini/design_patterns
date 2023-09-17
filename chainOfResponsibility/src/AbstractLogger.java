public abstract class AbstractLogger implements LoggerHandler {

    protected LoggerHandler nextLogger;
    protected int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    @Override
    public LoggerHandler setNext(LoggerHandler next) {
        this.nextLogger = next;
        return this;
    }

    protected void next(String message, int level) {
        if(nextLogger != null) {
            nextLogger.log(message, level);
        }
    }
}
