package Minefield;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,c;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number of rows:");
        r = inp.nextInt();
        System.out.println("enter number of columns:");
        c = inp.nextInt();
        MineSweeper mine = new MineSweeper(r,c);
        mine.run();
        inp.close();
    }
}
