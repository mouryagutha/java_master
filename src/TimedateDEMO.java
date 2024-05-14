import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class TimedateDEMO {

    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        LocalTime s = LocalTime.now();
        System.out.println(d);
        System.out.println(s);
        System.out.println(" ");

        LocalTime I = LocalTime.now(ZoneId.of("Israel"));

        System.out.println(I);

//        for(String  z : ZoneId.getAvailableZoneIds().toArray(new String[0]))
//        {
//            System.out.println(z);
//        }
    }
}
