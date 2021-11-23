/*
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

*/
/**
 * @author chaiguanguan
 * @className Vo
 * @description
 * @date 2020/2/20 9:19
 **//*

@Builder
@Data
public class Vo {
    private String name;
    private int age;
    private long account;
    private String msg;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Vo vo = (Vo) o;
        return age == vo.age ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
*/
