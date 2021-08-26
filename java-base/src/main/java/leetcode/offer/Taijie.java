package leetcode.offer;

/**
 * <b>功能描述:青蛙跳台阶</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-06-09 8:43
 * @since JDK 1.8
 */
public class Taijie {
    public static int numWays(int n) {
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        int i = numWays(5);
    }
}