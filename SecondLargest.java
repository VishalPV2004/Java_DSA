package Strivers_DSA;
import java.util.*;
public class SecondLargest {
    public static int SecondLargest(int arr[],int a)
    {
    	int max = Integer.MIN_VALUE;
    	int smax = Integer.MIN_VALUE;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		if (arr[i] > max)
    		{
    			smax = max;
    			max = arr[i];
    		}
    		
    		else if (arr[i] > smax)
    		{
    			smax = arr[i];
    		}
    	}
    	return smax;
    }
	public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int a = in.nextInt();
         int arr[] = new int[a];
         for(int i=0;i<a;i++)
         {
        	 arr[i] = in.nextInt();
         }
         
         
         System.out.print(SecondLargest(arr,a));
	}

}
