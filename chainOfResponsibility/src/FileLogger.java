public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        super(level);
    }

    @Override
    public void log(String message, int level) {
        if(level >= this.level) {
            System.out.println("File::" + message);
        }
        next(message, level);
    }
}
