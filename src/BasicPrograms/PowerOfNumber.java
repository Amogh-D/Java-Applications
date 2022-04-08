package BasicPrograms;

public class PowerOfNumber {
    public static void main(String[] args) {
        int number = 5;
        int p = 6;
        long result = 1;

        int i = p;
        for (;i != 0; --i)
        {
            result *= number;
        }
        System.out.println(number + "^" + p + " = " + result);
    }
}