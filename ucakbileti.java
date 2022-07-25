import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        
        int distance,age,ticketType;
        Scanner inp = new Scanner(System.in);

        System.out.println("enter informations...");
        System.out.println("distance:");
        distance = inp.nextInt();
        System.out.println("age:");
        age = inp.nextInt();
        System.out.println("ticket type (one way = 1 round-trip = 2):");
        ticketType = inp.nextInt();

        double total=0;

        if( distance>0 && age > 0 && (ticketType == 1 || ticketType == 2)){
            total = distance*0.10;
            if(age<12){
                total *= 0.5;
                if(ticketType == 2){
                    total -= total*0.2;
                    total *=2;
                }
            }else if(age<24){
                total -= total*0.10;
                if(ticketType == 2){
                    total -= total*0.2;
                    total *=2;
                }
            }else if(age< 65){

                if(ticketType == 2){
                    total -= total*0.2;
                    total *=2;
                }

            }else{
                total -= total*0.3;
                if(ticketType == 2){
                    total -= total*0.2;
                    total *=2;
                }

            }
            System.out.println("total ="+ total);

        }else{
            System.out.println("you entered wrong information!");
        }

        inp.close();
    }
}
