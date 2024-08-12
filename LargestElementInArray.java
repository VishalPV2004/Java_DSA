package Strivers_DSA;
import java.util.*;
public class LargestElementInArray {
	public static int largest(int n, int[] arr) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        
        return max;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int arr[] = new int[a];
		
		for(int i=0;i<a;i++)
		{
		     arr[i] = in.nextInt();
		}
		System.out.print(largest(a,arr));

	}

}
