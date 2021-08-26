package playingAlgorithm;

import java.util.LinkedList;

/**
 * <b>功能描述:玩转算法</b><br>
 * @author nezhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-06-13 21:17
 * @since JDK 1.8
 */
public class SortTest {
    public static int binarySearch(int[] array, int target){
        int length = array.length-1;
        // 对于已经有序的列表 [] 左右都是闭区间
        int left = 0, right = length;
        while(left <= right){
            int mid = right + (left - right) /2;
            // 目标在mid的左边
            if(array[mid] > target){
                right = mid - 1;
            } else if(array[mid] < target){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }


    /***
     * 将数组的所有0移动到末尾 其他保持相对位置
     * @param array
     * @return
     */
    public static int[] moveZeros(int[] array){
        // 牺牲空间
        int length = array.length;
        int[] newArray = new int[length];
        int n = 0;
        // 不为0的填补到新的数组前
        for (int i = 0 ;i < length; i++) {
            if (array[i] != 0){
                newArray[n] = array[i];
                n++;
            }
        }
        for(int newN = n ;newN <length -n; newN++){
            newArray[newN] = 0;
        }
        return newArray;
    }
    /***
     * 将数组的所有0移动到末尾 其他保持相对位置使用队列
     * @param array
     * @return
     */
    public static Integer[] moveZerosByQue(int[] array){
        int length = array.length;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            if(array[i] == 0){
                queue.addLast(array[i]);
            }else {
                queue.addFirst(array[i]);
            }
        }
        return queue.toArray(new Integer[0]);
    }

    /***
     * 将数组的所有0移动到末尾 其他保持相对位置使用队列
     * @param array
     * @return
     */
    public static int[] moveZerosPointer(int[] array){
       // 0-->k是不为0的判断
        int k = 0;
        int length = array.length;
        // 遍历0 -》 i 保证【0,i】的所有非零元素按照[0,k)顺序排列在里面
        for (int i = 0; i < length; i++) {
            if(array[i] != 0){
                array[k] = array[i];
                k++;
            }
        }

        // 剩下的补位0
        for (int i = k; i < length; i++) {
            array[i] = 0;
        }
        return array;
    }
    /***
     * 将数组的所有0移动到末尾 其他保持相对位置使用队列
     * @param array
     * @return
     */
    public static int[] moveZerosSwap(int[] array){
        // 0-->k是不为0的判断
        int k = 0;
        int length = array.length;
        // 遍历0 -》 i 保证【0,i】的所有非零元素按照[0,k)顺序排列在里面
        for (int i = 0; i < length; i++) {
            // 非零元素放在前面
            if(array[i] != 0){
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;
                k++;
            }
        }
        return array;
    }

    /***
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次
     * ，返回删除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在
     * 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        // 不要开辟新的空间
        int newLength = 0;
        for(int i = 0; i <nums.length; i++){
            if(newLength < 2 || nums[i] != nums[newLength-2]){
                nums[newLength++] = nums[i];
            }
        }
        return newLength;
    }
    public static int[] sortColors(int[] nums) {
        if(nums == null || nums.length < 1){
            return nums;
        }
        int[] array = {0,0,0};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                array[0] = array[0] + 1;
            }
            if(nums[i]  == 1){
                array[1] = array[1] + 1;
            }
            if(nums[i] == 2){
                array[2] = array[2] + 1;
            }
        }


        for(int j = 0; j < array[0]; j++){
            nums[j] =0;
        }
        for(int j = array[0] ; j < nums.length- array[2]; j++){
            nums[j] =1;
        }
        for(int j =array[0]+array[1]; j < nums.length; j++){
            nums[j] =2;
        }
        return nums;
    }

    public static void main(String[] args) {
       /* int[] array = {1,23,44,55,66,777,5559};
        int target = binarySearch(array, 66);
        System.out.println("array====="+ target);

        int[] ints = moveZeros(new int[]{1, 2, 0, 0, 56, 88, 999, 0});
        for (int anInt : ints) {
            System.out.print("---->"+anInt);
        }
        System.out.println("================");
        Integer[] moveZerosByQu = moveZerosByQue(new int[]{1, 2, 0, 0, 56, 88, 999, 0});
        for (int anInt : ints) {
            System.out.print("---->"+anInt);
        }
        int[] moveZerosSwap1 = moveZerosSwap(new int[]{0, 2, 0, 0, 56, 88, 999, 0});
        System.out.println("------------------");
        for (int anInt : moveZerosSwap1) {
            System.out.print("=====>"+anInt);
        }*/
        int[] ints = sortColors(new int[]{2, 0, 2, 1, 1, 0});
        for (int i = 0; i < ints.length; i++) {
            System.out.print("====>"+ints[i]);
        }
    }

}