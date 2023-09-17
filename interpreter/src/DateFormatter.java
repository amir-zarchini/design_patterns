import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateFormatter implements AbstractDateFormatter {

    private List<AbstractDateFormatter> formatters;

    public DateFormatter() {
        this.formatters = new ArrayList<>();
    }

    void addFormatter(AbstractDateFormatter formatter) {
        formatters.add(formatter);
    }

    @Override
    public String format(LocalDate date, String format) {
        for (AbstractDateFormatter formatter : formatters) {
            format = formatter.format(date, format);
        }
        return format;
    }
}
