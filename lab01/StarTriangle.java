package lab01;

import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        // Prompt the user to enter the height of the triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int n = input.nextInt();

        // Loop to display the triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

