import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chaiguanguan
 * @className ServiceImpl
 * @description
 * @date 2020/1/2 22:51
 **/
public class ServiceImpl implements Service {
    public void say() {
        System.out.println("哈啊哈");
    }
/*
    public static void main(String[] args) {
        //BigDecimal bigDecimal = new BigDecimal("17322.5").divide(new BigDecimal("100")).setScale(3, BigDecimal.ROUND_HALF_UP);
        BigDecimal bigDecimal = new BigDecimal("17322.5").divide(new BigDecimal("100")).setScale(4);
        System.out.println(bigDecimal);
    }*/
public static void main(String[] args) {
/*  *//*  Double a = 154.800;
    System.out.println(a*100);
    BigDecimal bigDecimal = new BigDecimal("154.809");
    System.ou*//*t.println(bigDecimal.multiply(new BigDecimal("100")).setScale(1));
    //*/
    List<String> list = new ArrayList();
    list.add("1.2");
    list.add("1.1");
    list.add("1.2");
    BigDecimal bigDecimal = new BigDecimal("0");
    for (String s : list) {
        BigDecimal bigDecimal1 = new BigDecimal(s);
        bigDecimal = bigDecimal.add(bigDecimal1);
    }
    System.out.println(bigDecimal);
}
}
