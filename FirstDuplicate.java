package Strivers_DSA;
import java.util.*;
public class FirstDuplicate {
    public static int FindDuplicate(int arr[])
    {
    	List<Integer> llist = new ArrayList<>();
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		llist.add(arr[i]);
    	}
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		if (llist.contains(arr[i]))
    		{
    			return arr[i];
    		}
    	}
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
        System.out.print(FindDuplicate(arr));
	}

}
