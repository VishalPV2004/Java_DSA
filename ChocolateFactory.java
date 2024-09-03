package Strivers_DSA;
import java.util.Scanner;
import java.util.Arrays;
//push zeros to end program
public class ChocolateFactory {
    public static int[] Adjusted(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();  
        int arr[] = new int[a];
        
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }

        arr = Adjusted(arr);

        System.out.println(Arrays.toString(arr));
    }
}
