package design.pattern.factory.abstractFactory;

/**
 * <b>功能描述:小米路由器</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 19:01
 * @since JDK 1.8
 */
public class XiaoMiRouter implements IRouterProduct{
    /***
     * 开始
     */
    @Override
    public void start() {
        System.out.println("小米路由器开启");
    }

    /***
     * 关机
     */
    @Override
    public void shutDown() {
        System.out.println("小米路由器关机");
    }

    /***
     * 设置参数
     */
    @Override
    public void setting() {
        System.out.println("小米路由器设置参数");
    }

    /***
     * 打开wifi
     */
    @Override
    public void openWifi() {
        System.out.println("小米路由器设置打开Wifi");
    }
}