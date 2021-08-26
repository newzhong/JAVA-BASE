package sort;

import java.util.Arrays;

/**
 * <b>功能描述:快速排序</b><br>
 * @author newzhong
 * @version 1.0.0
 * @since JDK 1.8
 *
 * @Note
 * <b>创建时间:</b> 2021-05-01 18:06 
 */
public class QKSort {
    /***
     * 双边循环
     * @param list
     * @param left
     * @param right
     * @return
     */
    public int division(int[] list, int left, int right) {
        // 以最左边的数(left)为基准元素
        int base = list[left];
        while (left < right) {
            // 从序列右端开始，向左遍历，直到找到小于base的数
            while (left < right && list[right] >= base){
                //向左
                right--;
            }
            // 找到了比base小的元素，将这个元素放到最左边的位置
            list[left] = list[right];
            // 从序列左端开始，向右遍历，直到找到大于base的数
            while (left < right && list[left] <= base){
                // 右移
                left++;
            }
            // 找到了比base大的元素，将这个元素放到最右边的位置
            list[right] = list[left];
        }
        // 最后将base放到left位置。此时，left位置的左侧数值应该都比left小；
        // 而left位置的右侧数值应该都比left大。
        list[left] = base;
        //基准元素的下标
        return left;
    }

    private void quickSort(int[] list, int left, int right) {

        // 左下标一定小于右下标，否则就越界了
        if (left < right) {
            // 对数组进行分割，取出下次分割的基准标号
            int base = division(list, left, right);

            System.out.format("base = %d:  ", list[base]);
            Arrays.stream(list).forEach(s-> System.out.print(s+" "));
            // 对“基准标号“左侧的一组数值进行递归的切割，以至于将这些数值完整的排序
            quickSort(list, left, base - 1);
            // 对“基准标号“右侧的一组数值进行递归的切割，以至于将这些数值完整的排序
            quickSort(list, base + 1, right);
        }
        System.out.println();
    }

    /***
     * 分区
     * @return
     */
    public static int quickSort1(int[] num, int left, int right){
        int base = num[left];

        while (left < right){
            while (left < right && num[right] >= base){
                right --;
            }
            num[left] = num[right];

            while (left< right && num[left] <= base){
                left ++;
            }
            num[right] = num[left];
        }
        num[left] = base;

        return left;
    }
    public static void quickSort2(int[] num, int left, int right){

        if (num == null || num.length < 1){
            return;
        }
        if(left < right){
            int i = quickSort1(num, left, right);
            //
            quickSort2(num, left, i - 1);
            quickSort2(num, i  + 1, right);
        }

    }


    public static void main(String[] args) {
        QKSort qkSort = new QKSort();
        int[] array ={60,50,48,37,10,90,84,36};
        quickSort2(array,0,array.length-1);
        Arrays.stream(array).forEach(i-> System.out.println(i));
    }

}