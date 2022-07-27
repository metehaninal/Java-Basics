import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int n;
        System.out.println("how many number will you enter ?");
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        int min = 0, max = 0;
        int num;

        for (int i = 1; i <= n; i++) {
            System.out.println(i+". num:");
            num = inp.nextInt();
            if(i == 1){
                min = num;
                max = num;
            }else{
                if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
            }
        }

        System.out.println("min:"+min);
        System.out.println("max:"+max);
        inp.close();

    }   
}
