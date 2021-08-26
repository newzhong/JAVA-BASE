package design.pattern.factory.abstractFactory;

/**
 * <b>功能描述:苹果手机</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 17:28
 * @since JDK 1.8
 */
public interface IRouterProduct {
    /***
     * 开始
     */
    void start();
    /***
     * 关机
     */
    void shutDown();
    /***
     * 设置参数
     */
    void setting();
    /***
     * 打开wifi
     */
    void openWifi();
}
