package Strivers_DSA;
import java.util.*;
public class LongestSequence {
    public static int GetLength(int arr[])
    {
    	int longest = 0;
    	int cnt = 0;
    	
    	HashSet<Integer> set = new HashSet<>();
    	for(int num : arr)
    	{
    		set.add(num);
    	}
    	
    	for(int x : arr)
    	{
    		if (!(set.contains(x-1)))
    		{
    		  int k = x;
    		  cnt = 1;
    		  
    		  while(set.contains(k+1))
    		  {
    			  k = k + 1;
    			  cnt++;
    		  }
    		  longest = Integer.max(longest, cnt);
    	    }
    	}
    	
    	return longest;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		int arr[] = new int[a];
		
		for(int i=0;i<a;i++)
		{
			arr[i] = in.nextInt();
		}
		
		System.out.println(GetLength(arr));

	}

}
