package Strivers_DSA;
import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {
    public static int[] Sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

        arr = Sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
