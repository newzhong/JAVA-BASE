package design.pattern.factory.method;

/**
 * <b>功能描述:消费者</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 16:13
 * @since JDK 1.8
 */
public class Consumer {
    /***
     * 工厂方法
     * @param args
     */
    public static void main(String[] args) {
        new WuLingFactory().getCarByName().printName();
        new TeSiLaFactory().getCarByName().printName();
    }
}