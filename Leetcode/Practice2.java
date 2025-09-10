import java.util.Arrays;

public class Practice2 {
    // 2 Sum
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //kandane
    class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
         int max = nums[0];  
        int prefix=0;
        for(int i=0;i<n;i++){
            prefix+=nums[i];
            max=Math.max(max,prefix);
            if(prefix<0){
               prefix=0;
            }
        }
        return max;
    }
}
//
    public static void main(String[] args) {
        Practice2 obj = new Practice2();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        if (result.length > 0) {
            System.out.println("Indexes: " + Arrays.toString(result));
        } else {
            System.out.println("No pair found");
        }
    }
}
