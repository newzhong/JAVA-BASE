package design.pattern.factory.builder;

/**
 * <b>功能描述抽象建造方法</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 20:17
 * @since JDK 1.8
 */
public abstract class Builder {
    /***
     * buildA
     */
    abstract void buildA();
    /***
     * buildB
     */
    abstract void buildB();
    /***
     * buildC
     */
    abstract void buildC();
    /***
     *建一个产品
     * @return Product
     */
    abstract Product getProduct();
}