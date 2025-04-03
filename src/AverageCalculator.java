// Isaiah Miracle 04/06/2025 Module 4 RockPaperScissors
public class AverageCalculator {

    // Overloaded methods to calculate the average
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to print array elements
    public static void printArray(String label, Number[] array) {
        System.out.print(label + " [ ");
        for (Number num : array) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        short[] shortArray = {5, 10, 15};
        int[] intArray = {1, 2, 3, 4};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        System.out.println("Average Calculator Test\n");

        // Print and calculate average for each type
        printArray("Short Array:", new Number[]{5, 10, 15});
        System.out.println("Average: " + average(shortArray) + "\n");

        printArray("Int Array:", new Number[]{1, 2, 3, 4});
        System.out.println("Average: " + average(intArray) + "\n");

        printArray("Long Array:", new Number[]{100L, 200L, 300L, 400L, 500L});
        System.out.println("Average: " + average(longArray) + "\n");

        printArray("Double Array:", new Number[]{2.5, 3.5, 4.5, 5.5, 6.5, 7.5});
        System.out.println("Average: " + average(doubleArray) + "\n");
    }
}
