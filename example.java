import java.util.Arrays;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        int[] arr = { -6,5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr); 
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nEnter a value from that array:");
        int n;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        System.out.println("entered number is ="+n);
        
        int indexOfN=0;
        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i]){
                indexOfN = i;
                break;
            }
        }

        System.out.println("nearest min value to entered value is = "+arr[indexOfN-1]);
        System.out.println("nearest max value to entered value is = "+arr[indexOfN+1]);

        inp.close();
    } 
}
