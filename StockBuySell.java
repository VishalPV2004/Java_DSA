package Strivers_DSA;
import java.util.*;
public class StockBuySell {
    public static int FindProfit(int arr[])
    {
    	
    	int maxProfit = 0;
    	int minimum = arr[0];
    	
    	for(int i = 1; i<arr.length;i++)
    	{
    		int cost = arr[i] - minimum;
    		maxProfit = Integer.max(cost,maxProfit);
    		minimum = Integer.min(minimum, arr[i]);
    	}
    	return maxProfit;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int prices[] = new int[]{7,1,5,3,6,4};
		
		System.out.print(FindProfit(prices));

	}

}
