package design.pattern.factory.clone;

import lombok.Data;

import java.util.Date;

/**
 * <b>功能描述:</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-26 22:36
 * @since JDK 1.8
 */
@Data
public class DeepClone implements Cloneable{
    private String userName;
    private Date birthDate;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        DeepClone d = (DeepClone) clone;
        d.birthDate = (Date) this.birthDate.clone();
        return super.clone();
    }
}