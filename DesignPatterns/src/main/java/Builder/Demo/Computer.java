package Builder.Demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chaiguanguan
 * @className Computer
 * @description
 * @date 2020/1/16 9:51
 **/
@Data
public abstract class Computer {
    protected String myBoard;
    protected String myDisplay;
    protected String myOs;

    public abstract void setMyOs();


}
