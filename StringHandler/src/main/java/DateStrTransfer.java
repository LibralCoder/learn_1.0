import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author chaiguanguan
 * @className DateStrTransfer
 * @description
 * @date 2020/2/20 17:57
 **/
public class DateStrTransfer {
    public static void main(String[] args) throws ParseException {
        long l = System.currentTimeMillis();
        String a = "20200220";
        LocalDate oldDate = LocalDate.parse(a, DateTimeFormatter.ofPattern("yyyyMMdd"));
        String newDate = oldDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(System.currentTimeMillis()-l);
        long l2 = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date parse = simpleDateFormat.parse(a);
        String format = simpleDateFormat.format(parse);
        System.out.println(System.currentTimeMillis()-l2);


    }
}
