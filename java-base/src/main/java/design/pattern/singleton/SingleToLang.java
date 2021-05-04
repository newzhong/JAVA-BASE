package design.pattern.singleton;

/**
 * <b>功能描述:懒汉模式</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-05-04 21:01
 * @since JDK 1.8
 */
public class SingleToLang {
    private static SingleToLang singleToLang;

    private SingleToLang() {}

    public static SingleToLang getInstance(){
        if (singleToLang == null){
            singleToLang =  new SingleToLang();

        }
        return singleToLang;
    }

    public static void testLangHang(){
        SingleToLang instance1 = SingleToLang.getInstance();
        SingleToLang instance2 = SingleToLang.getInstance();
        if (instance1 == instance2){
            System.out.println("nstance1 = instance2");
        }else{
            System.out.println("nstance1 != instance2");
        }


    }

    public static void main(String[] args) {
        testLangHang();
    }
}