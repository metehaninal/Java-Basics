import java.util.Scanner;

public class zodyak {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);
        System.out.println("when were you born? ");
        year = inp.nextInt();
        //chinese horoscope
        if(year % 12 == 0){
            System.out.println("you are monkey !");
        }else if(year % 12 == 1){
            System.out.println("you are rooster");
        }else if(year % 12 == 2){
            System.out.println("you are dog");
        }else if(year % 12 == 3){
            System.out.println("you are pig");
        }else if(year % 12 == 4){
            System.out.println("you are mause");
        }else if(year % 12 == 5){
            System.out.println("you are ox");
        }else if(year % 12 == 6){
            System.out.println("you are tiger");
        }else if(year % 12 == 7){
            System.out.println("you are rabbit");
        }else if(year % 12 == 8){
            System.out.println("you are dragonmanser");
        }else if(year % 12 == 9){
            System.out.println("you are snake");
        }else if(year % 12 == 10){
            System.out.println("you are horse");
        }else if(year % 12 == 11){
            System.out.println("you are sheep");
        }else{
            System.out.println("invalid month!");
        }
        inp.close();
    }
}
