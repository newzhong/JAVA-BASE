package design.pattern.singleton;

/**
 * <b>功能描述:</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-05-04 20:57
 * @since JDK 1.8
 */
public class TestSingleTo {
    public static void main(String[] args) {
        ////SingletonEr singletonEr = new SingletonEr();
        //SingletonEr singletonEr1 = SingletonEr.getSingletonErInstance();
        //SingletonEr singletonEr2 = SingletonEr.getSingletonErInstance();
        //
        //if (singletonEr1 == singletonEr2){
        //    System.out.println("singletonEr1 == singletonEr2");
        //}else{
        //    System.out.println("singletonEr1 != singletonEr2");
        //}
        //
        //// 测试懒汉
        //testLangHang();

        String str = "00";
        String eventType= "11B21";
        StringBuilder sb = new StringBuilder(eventType);
        sb.replace(3, 5, str);
        System.out.println(sb.toString());
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
}