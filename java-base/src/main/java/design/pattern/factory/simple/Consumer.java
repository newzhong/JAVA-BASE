package design.pattern.factory.simple;

/**
 * <b>功能描述:消费者</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 16:13
 * @since JDK 1.8
 */
public class Consumer {
    /***
     * 静态工厂不符合开闭原则
     * @param args
     */
    public static void main(String[] args) {
        Car wuLing = CarFactory.getCarByName("五菱");
        Car teSiLa = CarFactory.getCarByName("特斯拉");

        wuLing.printName();
        teSiLa.printName();
    }
}