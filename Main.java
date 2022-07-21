
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
    
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Mat:");
            mat = input.nextInt();

            System.out.print("Fizik:");
            fizik = input.nextInt();

            System.out.print("Kimya:");
            kimya = input.nextInt();

            System.out.print("Turkce:");
            turkce = input.nextInt();

            System.out.print("Tarih:");
            tarih = input.nextInt();

            System.out.print("Muzik:");
            muzik = input.nextInt();
        }
        
        double average = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        String s = (average<60) ? "sinifta kaldi" : "sinifi gecti";
        System.out.println(s);
        
    }
}
