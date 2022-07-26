import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number:");
        num = inp.nextInt();

        int count=0,total = 0 ;
        double average=0;

        for (int i = 0; i < num; i++) {
            if(i % 3 == 0 || i % 4 == 0){
                total += i;
                count++;
            }
        }
        average = total/count;
        System.out.println("average is :"+average);
        inp.close();
    }
    
}
