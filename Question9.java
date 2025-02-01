import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner. nextInt();

        int[][] array = new int[rows][cols];
        for(int i =0;i<rows;i++){
            for(int j = 0;j<cols; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;
        int rowNumber = 1;

        for(int[] row: array){
            int rowSum = 0;
            for(int num: row){
                rowSum += num;
            }if(rowSum> maxSum){
                maxSum = rowSum;
                maxRow = rowNumber;
            }
            rowNumber++;
        }
        System.out.println("Row with the maximum sum: "+maxRow);;
        System.out.println("Maximum sum: "+maxSum);

        scanner.close();
    }
}
