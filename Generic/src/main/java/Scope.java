import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/**
 * @author chaiguanguan
 * @className Scope
 * @description
 * @date 2020/1/17 15:49
 **/
public class Scope {
    private static Logger logger = LogManager.getLogger(Scope.class);

    public static void main(String[] args) {
        ArrayList<String> list1 = Lists.newArrayList();
        ArrayList<Integer> list2 = Lists.newArrayList();

        if(list1.getClass().equals(list2.getClass())){
            logger.info("泛型的作用域只在编译期");
            System.out.println(list2.getClass());
        }
    }
}
