package NumberPrograms;

import java.util.Scanner;

public class HCFAndLCM {
    public static void main(String args[]){
        int temp1, temp2, num1, num2, temp, hcf, lcm;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number #1: ");
        num1 = scanner.nextInt();
        System.out.print("Enter Number #2: ");
        num2 = scanner.nextInt();
        scanner.close();

        temp1 = num1;
        temp2 = num2;

        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (num1 * num2)/hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }
}