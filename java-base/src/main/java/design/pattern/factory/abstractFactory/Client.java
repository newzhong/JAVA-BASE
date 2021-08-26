package design.pattern.factory.abstractFactory;

/**
 * <b>功能描述:客户端调用</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 19:39
 * @since JDK 1.8
 */
public class Client {
    /***
     * 围绕一个超级抽象接口工厂创建其他工厂
     * @param args
     */
    public static void main(String[] args) {
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IphoneProduct iphoneProduct = huaWeiFactory.iphoneProduct();
        iphoneProduct.start();
        iphoneProduct.sendSms();
        iphoneProduct.callUp();
        iphoneProduct.shutDown();

        System.out.println("==============================");
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IRouterProduct iRouterProduct = xiaoMiFactory.irouterProduct();
        iRouterProduct.start();
        iRouterProduct.setting();
        iRouterProduct.openWifi();
        iRouterProduct.shutDown();
    }
}