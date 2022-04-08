package BasicPrograms;

import java.util.Scanner;
public class Interest
{
    public static void main(String args[])
    {
        float p, r, t, interest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        p = scan.nextFloat();
        System.out.print("Enter ROI: ");
        r = scan.nextFloat();
        System.out.print("Enter Time: ");
        t = scan.nextFloat();
        scan.close();
        interest = (p * r * t) / 100;
        double interestRound = Math.round(interest * 100.0) / 100.0;
        System.out.print("Simple Interest: " + interestRound);
    }
}