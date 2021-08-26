package design.pattern.factory.method;

/**
 * <b>功能描述:</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 16:21
 * @since JDK 1.8
 */
public class WuLingFactory implements CarFactory{

    /***
     * 通过名字获取
     * @return Car
     */
    @Override
    public Car getCarByName() {
        return new WuLingCar();
    }
}