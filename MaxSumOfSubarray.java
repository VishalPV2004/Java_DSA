package Strivers_DSA;
import java.util.*;

public class MaxSumOfSubarray {
    public static int MaxSubArray(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (sum > max) {
                max = sum;
            }
            
            if (sum < 0) {
                sum = 0;
            }
        }
        return max; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(MaxSubArray(arr));
    }
}
