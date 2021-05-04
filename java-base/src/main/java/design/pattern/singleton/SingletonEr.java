package design.pattern.singleton;

/**
 * <b>功能描述:饿汉</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-05-04 20:54
 * @since JDK 1.8
 */
public class SingletonEr {
    public static SingletonEr singletonEr = new SingletonEr();
    private SingletonEr(){}
    public static SingletonEr getSingletonErInstance(){
        return singletonEr;
    }
}