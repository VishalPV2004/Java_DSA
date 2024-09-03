package Strivers_DSA;
import java.util.*;
public class LongestSubsequenceWORepeatChar {
    public static String LongestSubs(String s) {
        char[] carr = s.toCharArray();
        
        int left = 0;
        int right = 0;
        ArrayList<Character> llist = new ArrayList<>();
        int max = 0;
        String res = "";
        
        for (right = 0; right < carr.length; right++) {
            while (llist.contains(carr[right])) {
                llist.remove((Character) carr[left]);
                left++;
            }
            llist.add(carr[right]);
            if (max < (right - left + 1)) {
                max = right - left + 1;
                res = s.substring(left, right + 1);
            }
        }
        
        return res;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		System.out.print(LongestSubs(s));

	}

}
