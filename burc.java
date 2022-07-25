import java.util.Scanner;

public class burc {
    public static void main(String[] args) {
        int month, day;
        String burc= "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dogdugunuz ay : ");
        month = inp.nextInt();
        System.out.print("Dogdugunuz gun : ");
        day = inp.nextInt();

        if (month == 1) {
            if (day > 0 && day <= 21) {
                burc= "Oglak";
            } else if (day > 0 && day <= 31) {
                burc= "Kova";
            } else
                isError = true;

        } else if (month == 2) {
            if (day > 0 && day <= 19) {
                burc= "Kova";
            } else if (day > 0 && day <= 29) {
                burc= "Balik";
            } else
                isError = true;

        } else if (month == 3) {
            if (day > 0 && day <= 20) {
                burc= "Balik";
            } else if (day > 0 && day <= 31) {
                burc= "Koc";
            } else
                isError = true;

        } else if (month == 4) {
            if (day > 0 && day <= 20) {
                burc= "Koc";
            } else if (day > 0 && day <= 30) {
                burc= "Boga";
            } else
                isError = true;

        } else if (month == 5) {
            if (day > 0 && day <= 21) {
                burc= "Boga";
            } else if (day > 0 && day <= 31) {
                burc= "Ikizler";
            } else
                isError = true;

        } else if (month == 6) {
            if (day > 0 && day <= 22) {
                burc= "Ikizler";
            } else if (day > 0 && day <= 30) {
                burc= "Yengec";
            } else
                isError = true;

        } else if (month == 7) {
            if (day > 0 && day <= 22) {
                burc= "Yengec";
            } else if (day > 0 && day <= 31) {
                burc= "Aslan";
            } else
                isError = true;

        } else if (month == 8) {
            if (day > 0 && day <= 22) {
                burc= "Aslan";
            } else if (day > 0 && day <= 31) {
                burc= "Basak";
            } else
                isError = true;

        } else if (month == 9) {
            if (day > 0 && day <= 22) {
                burc= "Basak";
            } else if (day > 0 && day <= 30) {
                burc= "Terazi";
            } else
                isError = true;

        } else if (month == 10) {
            if (day > 0 && day <= 22) {
                burc= "Terazi";
            } else if (day > 0 && day <= 31) {
                burc= "Akrep";
            } else
                isError = true;

        } else if (month == 11) {
            if (day > 0 && day <= 21) {
                burc= "Akrep";
            } else if (day > 0 && day <= 30) {
                burc= "Yay";
            } else
                isError = true;

        } else if (month == 12) {
            if (day > 0 && day <= 21) {
                burc= "Yay";
            } else if (day > 0 && day <= 31) {
                burc= "Oglak";
            } else
                isError = true;
        }
        if ((month > 12) || (month < 1)) {
            System.out.println("Hatali giris");
        } else if (isError) {
            System.out.println("Hatali giris");
        } else {
            System.out.println("Burcunuz : " + burc);
        }
        inp.close();
    }
        
}

