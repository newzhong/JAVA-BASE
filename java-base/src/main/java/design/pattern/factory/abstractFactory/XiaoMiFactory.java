package design.pattern.factory.abstractFactory;

/**
 * <b>功能描述:小米工厂</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 19:20
 * @since JDK 1.8
 */
public class XiaoMiFactory implements IProductFactory{
    /***
     * 生产手机
     * @return IphoneProduct
     */
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaoMiPhone();
    }

    /***
     * 生产路由器
     * @return IRouterProduct
     */
    @Override
    public IRouterProduct irouterProduct() {
        return new XiaoMiRouter();
    }
}