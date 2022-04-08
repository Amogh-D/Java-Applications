package ArrayPrograms;

public class AddMatrix {
    public static void main(String[] args) {
        int rows = 2, columns = 4;

        int[][] firstMatrix = { {4,5,6,2,5}, {1,9,4,6,8} };
        int[][] secondMatrix = { {9,2,3,4,5}, {4,5,6,9,2} };


        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("Sum of Matrices: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
    }
}