import java.util.Scanner;
public class MatricesAddition {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      //type an array of number have the same number of indices of the matrix with nothing but space between each
      System.out.print("Enter the number of rows in the matrices: ");
      int rows = input.nextInt();

      System.out.print("Enter the number of columns in the matrices: ");
      int columns = input.nextInt();

      int[][] matrix1 = new int[rows][columns];
      int[][] matrix2 = new int[rows][columns];
      int[][] sum = new int[rows][columns];

      System.out.println("Enter the elements of first matrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            matrix1[i][j] = input.nextInt();
         }
      }

      System.out.println("Enter the elements of second matrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            matrix2[i][j] = input.nextInt();
         }
      }

      // Adding matrices
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            sum[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }

      // Displaying the result
      System.out.println("\nSum of the matrices:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            System.out.print(sum[i][j] + " ");
         }
         System.out.println();
      }
   }
}
