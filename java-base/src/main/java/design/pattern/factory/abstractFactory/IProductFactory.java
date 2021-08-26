package design.pattern.factory.abstractFactory;

/**
 * <b>功能描述:抽象工厂</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 19:18
 * @since JDK 1.8
 */
public interface IProductFactory {
    /***
     * 生产手机
     * @return IphoneProduct
     */
    IphoneProduct iphoneProduct();

    /***
     * 生产路由器
     * @return IRouterProduct
     */
    IRouterProduct irouterProduct();
}
