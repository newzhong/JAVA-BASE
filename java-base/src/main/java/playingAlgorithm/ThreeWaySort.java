package playingAlgorithm;

/**
 * <b>功能描述:三路快排</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-06-14 16:41
 * @since JDK 1.8
 */
public class ThreeWaySort {
    public static int[] threeWaySort(int[] nums){
        if (nums == null || nums.length < 1){
            return null;
        }

        // 标识[0-zero] 0 num[0,zero]
        int zero = -1;
        int two = nums.length;
        for (int i = 0;i < two;){
            if (nums[i] == 1){
                i++;
            }
            if (nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[--two];
                nums[two] = temp;
            }
            if (nums[i] == 0){
                int temp = nums[i++];
                nums[i] = nums[++zero];
                nums[zero] = temp;
                i++;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        ThreeWaySort threeWaySort = new ThreeWaySort();
        int[] ints = threeWaySort.sortColors(new int[]{2,0,2,1,1,0});
        for (int i = 0; i <ints.length ; i++) {
            System.out.println("----->"+ ints[i]);
        }
    }
    public int[] sortColors(int[] nums) {
        int zero = -1;
        int two = nums.length;
        for(int i = 0 ;i < two; ){
            if(nums[i] == 1){
                i++;
            }
            else if(nums[i] == 2){
                --two;
                int tmep = nums[i];
                nums[i] = nums[two];
                nums[two] = tmep;
            }else{
                zero++;
                int tmep = nums[i];
                nums[i] = nums[zero];
                nums[zero] = tmep;
                i++;

            }
        }
        return nums;
    }
    void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}