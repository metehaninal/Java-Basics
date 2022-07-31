import java.util.Arrays;
import java.util.Scanner;

public class sortingArr {

    static int[] sorting(int[]arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int size;
        System.out.println("enter size of array:");
        Scanner inp = new Scanner(System.in);
        size = inp.nextInt();
        int[] arr = new int[size];
        
        System.out.println("enter elements :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+". element: ");
            arr[i] = inp.nextInt();
            System.out.println();
        }
        sorting(arr);
        System.out.println(Arrays.toString(arr));

        inp.close();
    }
}
