import java.util.Random;

public class SalaryProcessor implements Cloneable {

    private String formula;
    private String personName;
    private float salary = 0;

    public SalaryProcessor() {
        //load all settings
        System.out.println("Initializing salary processor ...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        formula = "Loaded formula";
        System.out.println("Salary processor initialized!");
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void calculate() {
        Random random = new Random();
        salary = random.nextFloat();
    }

    @Override
    public String toString() {
        return "SalaryProcessor{" +
                "personName='" + personName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    protected Object clone() {

        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
