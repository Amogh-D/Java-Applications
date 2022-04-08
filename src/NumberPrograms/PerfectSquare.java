package NumberPrograms;
import java.util.Scanner;
public class PerfectSquare {
    static boolean checkPerfectSquare(double x)
    {

        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();

        if (checkPerfectSquare(num))
            System.out.print("Perfect Square? true");
        else
            System.out.print("Perfect Square? false");
    }
}