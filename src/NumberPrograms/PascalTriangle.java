package NumberPrograms;
import java.util.Scanner;
public class PascalTriangle {
    static int factorial(int num) {
        int fact;
        for(fact = 1; num > 1; num--){
            fact *= num;
        }
        return fact;
    }
    static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    public static void main(String args[]){
        int rows, i, j;

        System.out.println("Enter # of Rows: ");
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();
        scanner.close();

        for(i = 0; i < rows; i++) {
            for(j = 0; j < rows-i; j++){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                System.out.print(" "+ ncr(i, j));
            }
            System.out.println();
        }
    }
}
