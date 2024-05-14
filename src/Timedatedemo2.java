import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Timedatedemo2 {
    public static void main(String[] args)
    {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}
