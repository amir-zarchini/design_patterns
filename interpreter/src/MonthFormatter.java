import java.time.LocalDate;

public class MonthFormatter implements AbstractDateFormatter {
    @Override
    public String format(LocalDate date, String format) {
        return format.replace("MM", String.valueOf(date.getMonthValue()));
    }
}
