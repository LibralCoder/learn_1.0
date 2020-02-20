import java.util.ArrayList;

/**
 * @author chaiguanguan
 * @className Why
 * @description 为什么要使用泛型
 * @date 2020/1/17 15:41
 **/
public class Why {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("12");
        list.add(10);
        list.stream().forEach(a -> {
            //java.lang.Integer cannot be cast to java.lang.String
            String str = (String)a;
            System.out.println(a);
        });
    }
}
