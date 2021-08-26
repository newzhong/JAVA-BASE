package design.pattern.factory.builder;


/**
 * <b>功能描述:</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 20:26
 * @since JDK 1.8
 */
public class Worker extends Builder {
    private Product product;

    public Worker() {
        product = new Product();
    }

    /***
     * buildA
     */
    @Override
    void buildA() {
        product.setBuildA("A");
        System.out.println("A");
    }

    /***
     * buildB
     */
    @Override
    void buildB() {
        product.setBuildB("B");
        System.out.println("B");
    }

    /***
     * buildC
     */
    @Override
    void buildC() {
        product.setBuildC("C");
        System.out.println("C");
    }

    /***
     *建一个产品
     * @return Product
     */
    @Override
    Product getProduct() {
        return product;
    }
}