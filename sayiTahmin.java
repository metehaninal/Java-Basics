import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100);

        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        boolean isWin = false;
        boolean isMistake = false;

        System.out.println(num);
        while (right < 5) {
            System.out.print("Lutfen tahmininizi giriniz : ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz.");
                if (isMistake) {
                    right++;
                    System.out.println("Cok fazla hatali giris yaptiniz. Kalan hak : " + (5 - right));
                } else {
                    isMistake = true;
                    System.out.println("Bir daha hatali girisinizde hakkinizdan dusulecektir.");
                }
                continue;
            }

            if (selected == num) {
                System.out.println("Tebrikler, dogru tahmin ! Tahmin ettigin sayi : " + num);
                isWin = true;
                break;
            } else {
                System.out.println("Hatali bir sayi girdiniz !");
                if (selected > num) {
                    System.out.println(selected + " sayisi, gizli sayidan buyuktur.");
                    right++;
                } else {
                    System.out.println(selected + " sayisi, gizli sayidan kucuktur.");
                    right++;
                }

                System.out.println("Kalan hakki : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettin ! ");

        }
        inp.close();

    }

}
