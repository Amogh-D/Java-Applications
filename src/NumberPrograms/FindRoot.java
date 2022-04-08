package NumberPrograms;
import java.util.Scanner;
class FindRoot {

    public static double sqRoot(int number) {
        double temp;
        double square = number / 2;

        do {
            temp = square;
            square = (temp + (number / temp)) / 2;
        } while ((temp - square) != 0);

        return square;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Square Root: " + sqRoot(num));
    }
}