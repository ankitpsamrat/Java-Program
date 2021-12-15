import java.time.*;
import java.time.format.DateTimeFormatter;

public class day_date {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy");
        String formattedDate = date.format(myDateFormat);
        System.out.println(formattedDate);
    }
}
