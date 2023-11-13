package A_JavaCore.Homework.JA_1_5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class JA1_5_15_VNDateFormat {
    public static void main(String[] args) {
        // Lấy thời gian hiện tại
        Calendar calendar = Calendar.getInstance();

        // Đặt múi giờ cho Việt Nam (GMT+7)
        TimeZone timeZone = TimeZone.getTimeZone("GMT+7");
        calendar.setTimeZone(timeZone);

        // Định dạng thời gian
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        // Hiển thị thời gian hiện tại ở Việt Nam
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
