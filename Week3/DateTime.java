import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {

        // 1. Current Date
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // 2. Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // 3. Current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);

        // 4. Create a Specific Date
        LocalDate specificDate = LocalDate.of(2026, 8, 12);
        System.out.println("Specific Date: " + specificDate);

        // 5. Get individual parts of the date
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDayOfMonth());

        // 6. Add 10 days
        LocalDate futureDate = date.plusDays(10);
        System.out.println("After 10 days: " + futureDate);

        // 7. Subtract 10 days
        LocalDate previousDate = date.minusDays(10);
        System.out.println("10 days ago: " + previousDate);
    }
}