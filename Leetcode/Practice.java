// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//          return nums[nums.length - k];
//     }
// }



// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int k=n+m;
//         int result[]=new int[k];
//         int index=0;
//         for(int i=0; i<m; i++) result[index++] = nums1[i];
//         for(int i=0; i<n; i++) result[index++] = nums2[i];
//          Arrays.sort(result);
//         for (int i = 0; i < k; i++) {
//             nums1[i] = result[i];
//         }
//     }
// }


// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         int count=0;
//         Arrays.sort(nums);
//         for(int i = 0; i < n; i++) {
//             count = 0;
//             for(int j = 0; j < n; j++) {
//                 if(nums[i] == nums[j]) {
//                     count++;
//                 }
//             }
//             if(count > n/2){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }



// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         int n=nums.length;
// Arrays.sort(nums);
// int count=0;
// for(int i=0;i<n-1;i++){
//     if(nums[i]==nums[i+1]){
//         count++;
//     }
//     if(count >= 1){
//         return true;
//     }
// }
// return false;

// }
// }



// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//          HashSet<Integer> set = new HashSet<>();
//         ArrayList<Integer> list = new ArrayList<>();

//         for (int num : nums1) {
//             set.add(num);
//         }

//         for (int num : nums2) {
//             if (set.contains(num) && !list.contains(num)) {
//                 list.add(num);
//             }
//         }

//         int[] result = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             result[i] = list.get(i);
//         }

//         return result;
//     }
// }



// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() !=t.length()) return false;
//            char[] arr1 = s.toCharArray();
//            char[] arr2=t.toCharArray();
//            java.util.Arrays.sort(arr1);
//            java.util.Arrays.sort(arr2);
//            return java.util.Arrays.equals(arr1, arr2);
// }
// }


// import java.util.Arrays;

// class Solution {
//     public char findTheDifference(String s, String t) {
//         char[] arrS = s.toCharArray();
//         char[] arrT = t.toCharArray();

//         Arrays.sort(arrS);
//         Arrays.sort(arrT);

//         for (int i = 0; i < arrS.length; i++) {
//             if (arrS[i] != arrT[i]) {
//                 return arrT[i];
//             }
//         }

//         return arrT[arrT.length - 1]; 
//     }
// }



// class Solution {
//     public int thirdMax(int[] nums) {
//         Arrays.sort(nums);             
//         int n = nums.length, cnt = 1;  

//         for (int i = n - 1; i >= 1; i--) {  
//             if (nums[i] != nums[i - 1])     
//                 cnt++;
//             if (cnt == 3)                   
//                 return nums[i - 1];         
//         }

//         return nums[n - 1];  
//     }
// }


// import java.util.ArrayList;

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<Integer> temp = new ArrayList<>();

//         // Add all elements of nums1 to temp list
//         for (int num : nums1) {
//             temp.add(num);
//         }

//         // Check each element in nums2
//         for (int num : nums2) {
//             if (temp.contains(num)) { // if it exists in nums1
//                 list.add(num);         // add to result
//                 temp.remove((Integer) num); // remove one occurrence
//             }
//         }

//         // Convert ArrayList to int[]
//         int[] result = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             result[i] = list.get(i);
//         }

//         return result;
//     }
// }


// Arrays.sort(g);  // sort greed factors
// Arrays.sort(s);  // sort cookie sizes

// int i = 0, j = 0; // i = child index, j = cookie index

// while (i < g.length && j < s.length) {  // traverse both arrays
//     if (s[j] >= g[i]) { // cookie can satisfy child
//         i++;            // move to next child
//     }
//     j++;                // move to next cookie
// }

// return i;  // number of satisfied children



// import java.util.*;

// class Solution {
//     public String[] findRelativeRanks(int[] score) {
//         int n = score.length;
//         String[] ans = new String[n];

//         Integer[] sorted = new Integer[n];
//         for (int i = 0; i < n; i++) {
//             sorted[i] = score[i];
//         }

//         Arrays.sort(sorted, Collections.reverseOrder());

//         Map<Integer, String> map = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             if (i == 0) map.put(sorted[i], "Gold Medal");
//             else if (i == 1) map.put(sorted[i], "Silver Medal");
//             else if (i == 2) map.put(sorted[i], "Bronze Medal");
//             else map.put(sorted[i], String.valueOf(i + 1));
//         }

//         for (int i = 0; i < n; i++) {
//             ans[i] = map.get(score[i]);
//         }

//         return ans;
//     }
// }


// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             nums[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(nums);
//         int[] result=new int[n];
//         for(int i=0;i<n;i++){
//             result[i]=nums[i];
//         }
//         return result;
//     }
// }


// class Solution {
//     public int dominantIndex(int[] nums) {
//         int n=nums.length;
//          int max = nums[0];
//         int idx = 0;
//         for(int i=0;i<n;i++){
//             if(nums[i]>max){
//                 max=nums[i];
//                 idx = i;
//             }
//         }
//             for (int i = 0; i < n; i++) {
//             if (i != idx && max < 2 * nums[i]) {
//                 return -1;
//             }
            
//         }
//         return idx;
//     }
// }


// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int n=nums.length;
//         int pos=0;
//         int neg=n-1;
//         int[] result=new int[n];
//         for(int i=0;i<n;i++){
//             if(nums[i]%2==0){
//                 result[pos++]=nums[i];
//             }
//             else{
//                 result[neg--]=nums[i];
//             }
//         }
//         return result;
//     }
// }


class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int evenIndex = 0; 
        int oddIndex = 1;  

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return result;
    }
}





//4/9/25
class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];         
        for(int i=0; i<nums.length; i++)  s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));
        return s[0].equals("0") ? "0" : String.join("",s);
    }
}


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int left = j + 1;
                int right = n - 1;
                while(left<=right){
                    int mid = left + (right - left) / 2;
                    int sum = nums[i] + nums[j] + nums[mid];
                    if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                        closestSum = sum;
                    }

                    if (sum < target) {
                        left = mid + 1;
                    } else if (sum > target) {
                        right = mid - 1;
                    } else {
                        return target;
                    }
                }
            }
        }

        return closestSum;
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet();
        for (int i = 0; i < nums.length - 2; i++)
            for (int j= i + 1; j < nums.length - 1; j++)
                for (int k = j + 1 ; k < nums.length; k++)
                    if (0 == nums[i] + nums[j] + nums[k]) {
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(list);
                        resultSet.add(list);
                    }
        return new ArrayList<>(resultSet);
    }
}




class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> map = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = target - (arr[i] + arr[j]);
                if (map.contains(third)) {
                    return true;
                }
                map.add(arr[j]);
            }
        }
        return false;
    
    }
}


