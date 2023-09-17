public interface LoggerHandler {

    int INFO = 1;
    int DEBUG = 2;
    int ERROR = 3;

    LoggerHandler setNext(LoggerHandler next);

    void log(String message, int level);
}
