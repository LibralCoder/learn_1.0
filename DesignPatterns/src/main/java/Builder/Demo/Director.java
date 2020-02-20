package Builder.Demo;

/**
 * @author chaiguanguan
 * @className Director
 * @description
 * @date 2020/1/16 10:14
 **/
public class Director {
    Builder builder = null;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(String board,String display){
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOs();
    }


}
