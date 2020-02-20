package ExeptionHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author chaiguanguan
 * @className NullPoi
 * @description
 * @date 2020/1/16 14:18
 **/
public class NullPoi {
    private static Logger logger = LogManager.getLogger(NullPoi.class);
    private static Logger log = LogManager.getLogger("hello");
    public static void main(String[] args) {
        int a = 1;
        String f = null;
        try {
            f.replace("d", "df");

        } catch (Exception e) {
          logger.error(e.toString());
          logger.error(e.getMessage());
          logger.error(e.fillInStackTrace());

            System.out.println("------------");
            log.error("我爱你"+"\n"+"中国");
        }
    }
}

