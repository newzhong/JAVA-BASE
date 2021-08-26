package design.pattern.factory.builder;

/**
 * <b>功能描述:</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-08-15 20:31
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}