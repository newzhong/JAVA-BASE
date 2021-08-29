package design.pattern.factory.clone;

import java.util.Date;
import java.util.Objects;

/**
 * <b>功能描述:</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-26 22:21
 * @since JDK 1.8
 */
public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepClone deepClone = new DeepClone();
        Date date = new Date();
        deepClone.setBirthDate(date);
        deepClone.setUserName("newzhong");

        System.out.println("----------------------");
        System.out.println(deepClone.toString());

        DeepClone clone = (DeepClone) deepClone.clone();
        System.out.println("--------------------");
        System.out.println(clone.toString());
        if (Objects.equals(deepClone, clone)){
            System.out.println("浅克隆的对象hashCode一致");
        }
        date.setTime(12345674);

        System.out.println("=================");
        System.out.println("================>v1"+deepClone.toString());
        System.out.println("================>v1"+clone.toString());
    }
}