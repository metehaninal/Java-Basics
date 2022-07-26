import java.util.Scanner;

public class kuvvet {
    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number:");
        num = inp.nextInt();

        System.out.println("power of 4:");
        for (int i = 1; i < num; i *=4) {
            System.out.print(i+" ");
        }
        System.out.println("\npower of 5:");
        for (int i = 1; i < num; i *=5) {
            System.out.print(i+" ");
        }
        inp.close();

    }
}
