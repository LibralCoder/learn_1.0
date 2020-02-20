package Builder.LombokBuilder;

/**
 * @author chaiguanguan
 * @className Begin
 * @description
 * @date 2020/1/16 11:13
 **/
public class Begin {
    public static void main(String[] args) {
        Sala build = Sala.builder().fruit("苹果").vegetable("黄瓜").build();
        System.out.println(build);
    }
}
