package Strivers_DSA;
import java.util.*;

public class RearrangeArrayBySign1 {
    public static int[] GetArray(int arr[])
    {
        int newArr[] = new int[arr.length];
        int negIndex = 0;
        int posIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newArr[negIndex] = arr[i];
                negIndex += 2; 
            } else {
                newArr[posIndex] = arr[i];
                posIndex += 2; 
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }

        int rearrangedArray[] = GetArray(arr);

        System.out.println(Arrays.toString(rearrangedArray)); 
    }
}
