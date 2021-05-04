package design.pattern.singleton;

/**
 * <b>功能描述:双重校验单例模式</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-05-04 20:53
 * @since JDK 1.8
 */
public class DoubleSingeTo {
    private static DoubleSingeTo doubleSingeTo;
    private DoubleSingeTo(){}
    public static DoubleSingeTo getInstance(){
        // 第一次检查
        if (doubleSingeTo == null){
            synchronized (DoubleSingeTo.class){
                // 第二次检查，可能多个线程挤在这里
                if (doubleSingeTo == null){
                    doubleSingeTo = new DoubleSingeTo();
                }
            }
        }
        return doubleSingeTo;
    }

    public static void main(String[] args) {
        DoubleSingeTo instance1 = DoubleSingeTo.getInstance();
        DoubleSingeTo instance2 = DoubleSingeTo.getInstance();

        if (instance1 == instance2){
            System.out.println("=");
        }else{
            System.out.printf("!=");
        }
    }
}