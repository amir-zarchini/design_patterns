import java.time.LocalDate;

public class DayFormatter implements AbstractDateFormatter {
    @Override
    public String format(LocalDate date, String format) {
        return format.replace("DD", String.valueOf(date.getDayOfMonth()));
    }
}
