import java.time.LocalDate;

public interface AbstractDateFormatter {

    String format(LocalDate date, String format);
}
