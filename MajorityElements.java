package Strivers_DSA;
import java.util.*;

//Moore Voting algorithm

public class MajorityElements {
    public static int GetTheMajorityElement(int arr[])
    {
    	int n = arr.length;
    	int el = 0;
    	int cnt = 0;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		if (cnt == 0)
    		{
    			el = arr[i];
    			cnt = 1;
    		}
    		
    		else if (arr[i] == el)
    		{
    			cnt++;
    		}
    		
    		else 
    			cnt--;
    	}
    	
    	int countFinal = 0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if (arr[i] == el)
    		{
    			countFinal++;
    		}
    	}
    	
    	if (countFinal > (n/2))
    	return el;
    	
    	
    	return -1;
    }
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int a = in.nextInt();
	    int arr[] = new int[a];
	    for(int i=0;i<a;i++)
	    {
	    	arr[i] = in.nextInt();
	    }
	    
	    System.out.print(GetTheMajorityElement(arr));

	}

}
