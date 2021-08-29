package design.pattern.factory.clone;

import lombok.Data;

import java.util.Date;
import java.util.Objects;

/**
 * <b>功能描述:浅克隆</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-26 22:18
 * @since JDK 1.8
 */
@Data
public class ShallowClone implements Cloneable {
    private String userName;
    private Date birthDate;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}