import org.junit.Test;

/**
 * @author chaiguanguan
 * @className test 换行
 * @description
 * @date 2020/1/16 18:08
 **/
public class test {
    @Test
    public void test01(){
        String cut = CutString.cut("0123312314312454", 5);
        System.out.println(cut);
    }
}
