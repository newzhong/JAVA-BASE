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
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowClone shallowClone = new ShallowClone();
        Date date = new Date();
        shallowClone.setBirthDate(date);
        shallowClone.setUserName("newzhong");

        System.out.println("----------------------");
        System.out.println(shallowClone.toString());

        ShallowClone clone = (ShallowClone) shallowClone.clone();
        System.out.println("--------------------");
        System.out.println(clone.toString());
        if (Objects.equals(shallowClone, clone)){
            System.out.println("浅克隆的对象hashCode一致");
        }
        date.setTime(12345674);

        System.out.println("=================");
        System.out.println("================>v1"+shallowClone.toString());
        System.out.println("================>v1"+clone.toString());
    }
}