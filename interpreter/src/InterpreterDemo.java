import java.time.LocalDate;
import java.time.LocalDateTime;

public class InterpreterDemo {

    public static void main(String[] args) {
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.addFormatter(new YearFormatter());
        dateFormatter.addFormatter(new MonthFormatter());
        dateFormatter.addFormatter(new DayFormatter());

        System.out.println(dateFormatter.format(LocalDate.now(), "YYYY-MM-DD"));
        System.out.println(dateFormatter.format(LocalDate.now(), "YYYY/MM/DD"));
    }
}
