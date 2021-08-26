package design.pattern.factory.simple;

import java.util.Objects;

/**
 * <b>功能描述:车工厂</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 16:07
 * @since JDK 1.8
 */
public class CarFactory {
    public static Car getCarByName(String name){
        if (Objects.equals(name, "五菱")){
            return new WuLingCar();
        }
        if (Objects.equals(name, "特斯拉")){
            return new TeSiLaCar();
        }
        else {
            return null;
        }
    }
}