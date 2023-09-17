public class PrototypeDemo {

    public static void main(String[] args) {

        SalaryProcessor processor1 = SalaryProcessorCache.getProcessor();
        processor1.setPersonName("Person 1");
        processor1.calculate();

        SalaryProcessor processor2 = SalaryProcessorCache.getProcessor();
        processor2.setPersonName("Person 2");
        processor2.calculate();

        SalaryProcessor processor3 = SalaryProcessorCache.getProcessor();
        processor3.setPersonName("Person 3");
        processor3.calculate();

        System.out.println(processor1);
        System.out.println(processor2);
        System.out.println(processor3);

    }
}
