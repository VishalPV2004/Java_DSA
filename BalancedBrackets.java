package Strivers_DSA;
import java.util.*;


public class BalancedBrackets {
	
   public static boolean IsBalanced(String s)
   {
	   Stack<Character> list = new Stack<>();
	   
	   for(char c : s.toCharArray())
	   {
		   if (c == '{' || c == '(' || c == '[')
		   {
			   list.push(c);
		   }
		   
		   else if (c == '}' || c == ')' || c == ']')
		   {
			   if (list.isEmpty())
			   {
				   return false;
			   }
			   
			   char top = list.pop();
			   
			   if (c == '}' && top != '{') 
				    return false;
			   if (c == ')' && top != '(')
				   return false;
			   if (c == ']' && top != '[')
				   return false;
		   }
	   }
	   
	   return (list.size() == 0) ? true : false;
   }
   public static void main(String args[])
   {
	   Scanner in = new Scanner(System.in);
	   String s = in.nextLine();
	   
	   System.out.print(IsBalanced(s));
   }
}
