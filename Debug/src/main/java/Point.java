/**
 * @author chaiguanguan
 * @className Point
 * @description
 * @date 2020/1/2 22:44
 **/
public class Point {
    public static void line(){
        System.out.println("this is from line");
    }

    public static void detailLine(){
        System.out.println("this is from lidetailLine");
    }
    public static void method(){
        System.out.println("this is from method");
        Service service = new ServiceImpl();
        service.say();
    }
    public static void exception(){
        Object a = null;
        a.toString();
    }
    public static  void field(){
        Person person = new Person();
        System.out.println("jaja");
        person.setAge(11);
        System.out.println(person);
    }
    public static void back(){
        Person person = new Person();
        person.setAge(12);
        person.setName("小明");
        System.out.println(person);
        System.out.println("fdj");
    }
    public static void main(String[] args) {
        //line();行断点
        System.out.println("first");
        detailLine();//详细行断点
        //method();//方法断点|在接口的方法上打断点，会在实现类的方法断点
        //exception();//异常断点，用来追溯异常
        //field();//字段异常
        //back();
    }
}
