package Subarray;
import java.util.*;
public class Practice {
    //“Maximum Subarray Sum
    public static int maxsub(int[] arr){
        int n=arr.length;
        int count=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            count+=arr[i];
            maxi=Math.max(maxi,count);
            if(count < 0) count = 0;
        }
        return maxi;
    }
    //Find all subarrays with given sum (positive numbers)
    public static int[] allsub(int[] arr,int target){
        int n=arr.length;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum == target){
                    // print subarray arr[i..j]
                } else if(sum > target){
                    break; // positive numbers
                }
            }
        }
        return sum;
    }
    //print all subarray
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
//Count Subarrays with Given Sum (Positive numbers)
public static int countSubarraysWithSum(int[] arr, int target) {
    int n = arr.length;
    int count = 0;
    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < n; j++) {
            sum += arr[j];
            if (sum == target) count++;
            else if (sum > target) break; // optimization for positive numbers
        }
    }
    return count;
}
//Length of Largest Subarray with Sum = K (Positive)
public static int largestSubarrayLength(int[] arr, int target) {
    int n = arr.length;
    int maxLen = 0;
    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < n; j++) {
            sum += arr[j];
            if (sum == target) maxLen = Math.max(maxLen, j - i + 1);
            else if (sum > target) break;
        }
    }
    return maxLen;
}

//strings
    //Print All Substrings
public static int longestUniqueSubstring(String s) {
    int n = s.length();
    int maxLen = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            String sub = s.substring(i, j + 1);
            if (allUnique(sub)) {
                maxLen = Math.max(maxLen, sub.length());
            }
        }
    }
    return maxLen;
}
    public static int countPalindromicSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) count++;
            }
        }
        return count;
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result=maxsub(arr);
        System.out.println(result);
    }
  }
