import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author chaiguanguan
 * @className DateStrTransfer
 * @description
 * @date 2020/2/20 17:57
 **/
public class DateStrTransfer {
    public static void main(String[] args) {
        String a = "20200220";
        LocalDate oldDate = LocalDate.parse(a, DateTimeFormatter.ofPattern("yyyyMMdd"));
        String newDate = oldDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(newDate);
    }
}
