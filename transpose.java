import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int matrix[][] = new int[3][2];
        int trMatrix[][] = new int[2][3];
        System.out.println("enter elements of matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(i+1+".row "+(j+1) + ".col :");
                matrix[i][j] = inp.nextInt();
            }
        }

        System.out.println("original matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("transposed matrix :");
        for(int i = 0 ; i< matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                trMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i <trMatrix.length ; i++){
            for(int j = 0 ; j<trMatrix[i].length;j++){
                System.out.print(trMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        inp.close();
    }
}
