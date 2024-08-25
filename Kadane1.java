package Strivers_DSA;
import java.util.*;
public class Kadane1 {

    public static int FindMaxSubArray(int arr[], int a)
    { 
        int sum = 0;
        int max = arr[0];
        for(int i = 0; i < a; i++)
        {
            sum += arr[i];
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = FindMaxSubArray(arr, arr.length);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

}
