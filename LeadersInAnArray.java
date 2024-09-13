package Strivers_DSA;
import java.util.*;
public class LeadersInAnArray {
    public static List GetLeaders(int arr[])
    {
    	ArrayList<Integer> alist = new ArrayList<>();
    	
    	int n = arr.length;
    	int max = arr[n-1];
    	alist.add(max);
    	for(int i=n-2;i>=0;i--)
    	{
    		if (arr[i] > max)
    		{
    			max = arr[i];
    			alist.add(arr[i]);
    		}
    	}
    	
      Collections.reverse(alist);
       return alist;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.print(GetLeaders(arr));

	}

}
