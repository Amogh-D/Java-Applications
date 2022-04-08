package ArrayPrograms;

public class ArraySum{
    public static void main(String args[]){
        int[] array = {30,40,20,100,200};
        int sum = 0;

        for( int num : array) {
            sum = sum + num;
        }
        System.out.println("Array Sum: " + sum);
    }
}