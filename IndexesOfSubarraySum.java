package Strivers_DSA;
import java.util.*;
public class IndexesOfSubarraySum {
    
	public static List<Integer> FindSubArray(int arr[],int size,int sum)
	{
	       int left = 0;
	       int sum1 = 0;
	       	       
	       ArrayList<Integer> llist = new ArrayList<>();
	       
	       for(int right = 0;right < size;right++)
	       {
	    	   sum1 += arr[right];
	    	   
	    	   while(sum1 > sum && left < right)
	    	   {
	    		   sum1 = sum1 - arr[left];
	    		   left++;
	    	   }
	    	   
	    	   if (sum1 == sum)
	    	   {
	    		   llist.add(left+1);
	    		   llist.add(right+1);
	    		   return llist;
	    	   }
	       }
	       llist.add(-1);
	       return llist;
	}
	
	public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int a = in.nextInt();
         int arr[] = new int[a];
         for(int i=0;i<a;i++)
         {
        	 arr[i] = in.nextInt();
         }
         
         int k = in.nextInt();
         
         System.out.print(FindSubArray(arr,a,k));
	}

}
