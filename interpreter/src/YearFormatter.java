import java.time.LocalDate;

public class YearFormatter implements AbstractDateFormatter {
    @Override
    public String format(LocalDate date, String format) {
        return format.replace("YYYY", String.valueOf(date.getYear()));
    }
}
