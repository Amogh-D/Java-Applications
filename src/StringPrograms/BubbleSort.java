package StringPrograms;

public class BubbleSort {
    public static void main(String []args) {
        String str[] = { "Amogh", "Atharva", "Mom", "Dad"};
        String temp;

        System.out.println("Sorted Order:");
        for (int j = 0; j < str.length; j++) {
            for (int i = j + 1; i < str.length; i++) {
                if (str[i].compareTo(str[j]) < 0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
            System.out.println(str[j]);
        }
    }
}