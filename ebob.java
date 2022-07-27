import java.util.Scanner;


public class ebob {
    public static void main(String[] args) {
        int n1,n2;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number:");
        n1 = inp.nextInt();
        System.out.println("enter other number:");
        n2 = inp.nextInt();

        int min = (n1 < n2) ? n1 : n2;
        int i = 1;
        int ebob = min;

        while(i <= min){
            if((n1%i == 0) && (n2%i == 0)){
                ebob = i;
            }
            i++;
        }
        int ekok = n1*n2/ebob;
        System.out.println("ebob:"+ebob);
        System.out.println("ekok:"+ekok);
        inp.close();
    }
}
