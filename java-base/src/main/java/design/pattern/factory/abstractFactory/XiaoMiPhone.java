package design.pattern.factory.abstractFactory;

/**
 * <b>功能描述:小米手机</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 17:38
 * @since JDK 1.8
 */
public class XiaoMiPhone implements IphoneProduct{

    /***
     * 开始
     */
    @Override
    public void start() {
        System.out.println("小米开机");
    }

    /***
     * 关机
     */
    @Override
    public void shutDown() {
        System.out.println("小米手机关机！");
    }

    /***
     * 打电话
     */
    @Override
    public void callUp() {
        System.out.println("小米手机打电话！");
    }

    /***
     * 发送短信
     */
    @Override
    public void sendSms() {
        System.out.println("小米发短信！");
    }
}