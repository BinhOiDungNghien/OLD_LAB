import java.util.Arrays;
public class SortArrays {

    public static void main(String[] args) {
        int[] numbers = {23, 6, 89, 12, 56, 45, 78, 11};

        // sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // calculate the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);

        // calculate the average value of array elements
        double average = (double) sum / numbers.length;
        System.out.println("Average value of array elements: " + average);
    }
}
