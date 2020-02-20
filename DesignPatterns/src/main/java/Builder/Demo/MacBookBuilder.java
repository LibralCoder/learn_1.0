package Builder.Demo;

/**
 * @author chaiguanguan
 * @className MacBookBuilder
 * @description
 * @date 2020/1/16 10:09
 **/
public class MacBookBuilder extends Builder {
    private Computer computer = new MacBook();
    @Override
    void buildBoard(String board) {
      computer.setMyBoard(board);
    }

    @Override
    void buildDisplay(String display) {
     computer.setMyDisplay(display);
    }

    @Override
    void buildOs() {
     computer.setMyOs();
    }

    @Override
    Computer build() {
        return computer;
    }
}
