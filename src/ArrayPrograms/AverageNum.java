package ArrayPrograms;

public class AverageNum
{

    public static void main(String[] args) {
        double[] arr = {100, 90, 3.4, 5.3, 90.4, 2.4, 5.3};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }

        double average = total / arr.length;

        System.out.format("Average: %.2f", average);
    }
}