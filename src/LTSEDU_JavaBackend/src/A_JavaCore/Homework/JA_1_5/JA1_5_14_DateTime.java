package A_JavaCore.Homework.JA_1_5;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JA1_5_14_DateTime {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();

        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
        System.out.println(DateFormat.format(calendar.getTime()));



    }
}
