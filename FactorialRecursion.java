package Strivers_DSA;
import java.util.*;
public class FactorialRecursion {
    public static int FactorialRecur(int a)
    {
    	if (a == 0)
    		 return 1;
        
    	else
    		return (a * FactorialRecur(a-1));
    }
	public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int a = in.nextInt();
          
          System.out.print(FactorialRecur(a));
	}

}
