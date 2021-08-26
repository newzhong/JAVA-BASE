package design.pattern.factory.builder;

/**
 * <b>功能描述:指挥生成产品</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 20:30
 * @since JDK 1.8
 */
public class Director {
    /***
     * 指挥创建得顺序等
     * @param builder
     * @return
     */
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getProduct();
    }
}