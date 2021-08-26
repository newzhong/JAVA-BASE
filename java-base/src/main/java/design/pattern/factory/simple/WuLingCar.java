package design.pattern.factory.simple;

/**
 * <b>功能描述:</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 16:06
 * @since JDK 1.8
 */
public class WuLingCar implements Car {
    /***
     * 输出名字
     */
    @Override
    public void printName() {
        System.out.println("我是五菱红光");
    }
}