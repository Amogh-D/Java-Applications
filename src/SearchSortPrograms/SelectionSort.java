package SearchSortPrograms;

public class SelectionSort
{
    public void selectionSort(int arr[])
    {
        int length = arr.length;

        for (int i = 0; i < length-1; i++)
        {
            int min = i;
            for (int j = i+1; j < length; j++)
                if (arr[j] < arr[min])
                    min = j;

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        SelectionSort object = new SelectionSort();
        int numberArray[] = {24, 340, 43, 49, 94};

        System.out.print("Original Array: ");
        object.print(numberArray);

        object.selectionSort(numberArray);

        System.out.print("Sorted Array: ");
        object.print(numberArray);
    }
}