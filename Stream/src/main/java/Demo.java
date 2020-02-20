import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author chaiguanguan
 * @className Demo
 * @description
 * @date 2020/2/19 16:38
 **/
public class Demo {
    public static void main(String[] args) {
        Vo maHuateng = Vo.builder().account(20000L).age(43).name("马化腾").msg("抽奖").build();
        Vo maYun = Vo.builder().account(10000L).age(48).name("马云").msg("100一滴水").build();
        Vo wangjianlin = Vo.builder().account(10000L).age(43).name("王建林").msg("1万一滴水").build();
        Vo chaiGuanGuan = Vo.builder().account(1000L).age(23).name("柴冠冠").msg("1块一滴水").build();
        List<Vo> vos = Arrays.asList(maHuateng, maYun, wangjianlin, chaiGuanGuan);
        /*一. stream中间操作,管道节点式操作，返回仍是stream
         * */
        System.out.println("映射 ：将年龄取出");
        vos.stream().map(a -> a.getAge()).forEach(System.out::println);
        System.out.println("截取 ：前三个");
        vos.stream().limit(3).forEach(System.out::println);
        System.out.println("截取 ：后三个");
        vos.stream().skip(3).forEach(System.out::println);
        System.out.println("过滤 ：小于23的不要");
        vos.stream().filter(a -> a.getAge()>23).forEach(System.out::println);
        System.out.println("去重 ：重写hashCode和equals");
        vos.stream().distinct().forEach(System.out::println);




        /*二. stream最终操作,返回仍是其他形式
         * */
        System.out.println("求元素和 : ");
        long count = vos.stream().count();
        System.out.println(count);
        System.out.println("遍历 : ");
        vos.stream().forEach(System.out::println);
        System.out.println("stream转为其他形式 : 根据年龄分组");
        Map<Integer, List<Vo>> collect = vos.stream().collect(Collectors.groupingBy(a -> a.getAge()));
    }
}
