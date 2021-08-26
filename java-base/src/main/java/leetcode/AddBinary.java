package leetcode;

import java.util.*;

/**
 * <b>功能描述:</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-05-08 23:03
 * @since JDK 1.8
 */
public class AddBinary {
    /***
     * @deprecated 二级制加法
     * @param a 二进制数 10
     * @param b 二进制数 1
     * @return 二级制的结果
     */
    public String addBinary(String a, String b) {
        // 拼接结果
        StringBuilder ans = new StringBuilder();

        int ca = 0;
        // 二级制的长度索引
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;

        for(int i = aLength, j = bLength;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            // ASCII码相减 将字符串类型转换成int类型
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            // 与运
            ans.append(sum & 1);
            // 右移
            ca = sum >> 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("请输入：");
        String[] s1 = s.trim().split(" ");

        int  s3 = Integer.parseInt(s1[1]);
        int[][] s4= new int[s3][s3];
        for (int i = 0; i < s3; i++) {
            String s2 = scanner.nextLine();
            String[] s5 = s2.trim().split(" ");
            for (int j = 0; j < s5.length; j++) {
                s4[i][j] = Integer.parseInt(s5[j]);
            }
        }
        List<Integer> result = new ArrayList<>(s3 * s3);
        result.add(1);
        Collections.sort(result);

    }
}