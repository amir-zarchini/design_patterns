public class SalaryProcessorCache {

    private static SalaryProcessor processor;

    static {
        processor = new SalaryProcessor();
    }

    public static SalaryProcessor getProcessor() {
        return (SalaryProcessor) processor.clone();
    }
}
