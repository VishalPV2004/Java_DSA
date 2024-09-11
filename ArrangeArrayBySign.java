package Strivers_DSA;
import java.util.*;
public class ArrangeArrayBySign {
    public static int[] getArray(int arr[])
    {
    	ArrayList<Integer> pos = new ArrayList<>();
    	ArrayList<Integer> neg = new ArrayList<>();
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		if (arr[i] < 0)
    		{
    			neg.add(arr[i]);
    		}
    		else
    		{
    			pos.add(arr[i]);
    		}
    	}
    	
    	if (pos.size() < neg.size())
    	{
    		for(int i=0;i<pos.size();i++)
    		{
    			arr[2*i] = pos.get(i);
    			arr[2*i+1] = neg.get(i);
    		}
    		
    		int index = pos.size() * 2;
    		for(int i = pos.size();i < neg.size();i++)
    		{
    			arr[index] = neg.get(i);
    			index++;
    		}
    	}
    	if (pos.size() > neg.size())
    	{
    		for(int i=0;i<neg.size();i++)
    		{
    			arr[2*i] = pos.get(i);
    			arr[2*i+1] = neg.get(i);
    		}
    		
    		int index = neg.size() * 2;
    		for(int i = neg.size();i < pos.size();i++)
    		{
    			arr[index] = pos.get(i);
    			index++;
    		}
    	}
    	return arr;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		int arr[] = new int[a];
		
		for(int i=0;i<a;i++)
		{
			arr[i] = in.nextInt();
		}
		int karr[] = getArray(arr);
		System.out.println(Arrays.toString(karr));

	}

}
