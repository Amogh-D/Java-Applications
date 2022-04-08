package SearchSortPrograms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String []args) {
        int num, i, j, temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter # of Integers: ");
        num = scanner.nextInt();

        int array[] = new int[num];

        System.out.println("Enter List of Integers: ");

        for (i = 0; i < num; i++)
            array[i] = scanner.nextInt();

        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted List: ");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);
    }
}