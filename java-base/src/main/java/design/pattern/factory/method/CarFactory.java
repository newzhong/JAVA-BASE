package design.pattern.factory.method;

import java.util.Objects;

/**
 * <b>功能描述:车工厂</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 16:07
 * @since JDK 1.8
 */
public interface CarFactory {
    /***
     * 通过名字获取
     * @return Car
     */
    Car getCarByName();
}