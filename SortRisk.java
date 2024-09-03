package Strivers_DSA;
import java.util.*;
public class SortRisk {
    
	public static int[] SortTheArrayByRisk(int arr[])
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr.length ; j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
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
		
		int karr[] = SortTheArrayByRisk(arr);
		
		System.out.print(Arrays.asList(karr));

	}

}
