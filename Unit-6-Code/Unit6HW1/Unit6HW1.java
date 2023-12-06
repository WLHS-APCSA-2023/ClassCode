public class Unit6HW1{

    public static void main(String[] args) {
        // Testing AboveAverage method
        testAboveAverage(new int[]{20, 30, 25, 35, -16, 60, -100}, 5);
        testAboveAverage(new int[]{1, 2, 3, 4, 5}, 2);
        testAboveAverage(new int[]{5, 5, 5, 5}, 0); // Edge case: All elements are same
        testAboveAverage(new int[]{10}, 0); // Edge case: Single element

        // Testing SmallestDifference method
        testSmallestDifference(new int[]{32, 71, 12, 45, 26}, 6);
        testSmallestDifference(new int[]{5, 3, 1, 9, 7}, 2);
        testSmallestDifference(new int[]{1, 1, 1, 1}, 0); // Edge case: All elements are same
        testSmallestDifference(new int[]{15}, Integer.MAX_VALUE); // Edge case: Single element
        testSmallestDifference(new int[]{10, 20, 30, 40, 50, 60, 70, 3}, 7);
        testSmallestDifference(new int[]{5, 12, 17, 21, 26, 33, 38}, 4);
        testSmallestDifference(new int[]{100, 95, 87, 80, 75, 70}, 5);

    }

    //
//
//

    /**
     * Write a Java program that calculates and prints
     * the average of an array of integers and then
     * counts how many numbers in the array are above
     * the average and prints that information.
     * @param arr - an array of integers
     * @return aboveAverageCount - the number of
     * elements that are greater than the average
     */
    public static int AboveAverage(int[] arr){

    }

    /**
     * Write a Java program to find the smallest absolute
     * difference between any two elements in an array
     * of integers. If it is a singleton,
     * return Integer.MAX_VALUE
     * @param arr - an array of integers
     * @return smallestDifference - the smallest difference
     * of any two integers in arr or Integer.MAX_VALUE
     */
    public static int SmallestDifference(int[] arr){
        
    }

    private static void testAboveAverage(int[] array, int expectedCount) {
        System.out.println("Testing AboveAverage with array: " + java.util.Arrays.toString(array));
        int count = Unit6HW1.AboveAverage(array);
        if (count == expectedCount) {
            System.out.println("Test Passed.");
        } else {
            System.out.println("Test Failed. Expected " + expectedCount + " but got " + count);
        }
        System.out.println();
    }

    private static void testSmallestDifference(int[] array, int expectedDifference) {
        System.out.println("Testing SmallestDifference with array: " + java.util.Arrays.toString(array));
        int difference = Unit6HW1.SmallestDifference(array);
        if (difference == expectedDifference) {
            System.out.println("Test Passed.");
        } else {
            System.out.println("Test Failed. Expected " + expectedDifference + " but got " + difference);
        }
        System.out.println();
    }

}
