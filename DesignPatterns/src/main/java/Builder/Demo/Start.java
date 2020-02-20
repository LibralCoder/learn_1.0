package Builder.Demo;

/**
 * @author chaiguanguan
 * @className Start
 * @description
 * @date 2020/1/16 10:21
 **/
public class Start {
    public static void main(String[] args) {
        MacBookBuilder macBookBuilder = new MacBookBuilder();
        Director director = new Director(macBookBuilder);
        director.construct("英特尔主板","超清显示器");
        Computer build = macBookBuilder.build();
        System.out.println(build);
    }
}
