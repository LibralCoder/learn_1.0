package Builder.Demo;

/**
 * @author chaiguanguan
 * @className Builder
 * @description
 * @date 2020/1/16 10:07
 **/
public abstract class Builder {
    abstract  void buildBoard(String board);
    abstract  void buildDisplay(String display);
    abstract  void buildOs();
    abstract  Computer build();
}
