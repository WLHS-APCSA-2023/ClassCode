import java.util.Arrays;

public class U6L4 {
	public static void main(String[] args) {
		// test code here

		//possible array you could use, might want smaller to start
		int[] arrayOInts = {8, 2, -11, 4, 0, -3, 5, 21, 37,
				-47, 4, 5, 3, 7, 42, 13, 28, 4};
		int[] uniqueArray = {-2, -1, 0, 1, 2};
		int[] duplicateTestArray = {5, 6, 7, 5, 5, 4, 3, 5, 1};
		int[] modeArray = {3,4,-8,5,12,5,7,4,5,6,6,3,4,4,7};


		System.out.println(findFirst(arrayOInts, 4));
		System.out.println(findFirst(arrayOInts, 20));
		System.out.println(duplicates(arrayOInts));
		System.out.println(duplicates(uniqueArray));
		//System.out.println(duplicateCount(duplicateTestArray));
		//System.out.println(duplicateCount(uniqueArray));
		System.out.println(average(arrayOInts));
		System.out.println(average(uniqueArray));
		System.out.println(min(arrayOInts));
		System.out.println(max(arrayOInts));
		System.out.println(range(arrayOInts));
		System.out.println(mode(modeArray));


		// Array rotation test
		int[] ogArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 4;

		System.out.println("Rotate given array " + Arrays.toString(ogArray)
				+ " by 4 places to the left.");

		int[] rotatedArray = rotateLeft(ogArray, ogArray.length, k);

		System.out.println("Rotated array: " + Arrays.toString(rotatedArray));

		System.out.println("Rotate given array " + Arrays.toString(ogArray)
				+ " by 4 places to the right.");

		rotatedArray = rotateRight(rotatedArray, rotatedArray.length, k);

		//Should be the same as the original array
		System.out.println("Rotated array: " + Arrays.toString(rotatedArray));

	}

	// return the index of the first occurrence of a
	// specified element in an array, -1 if not found

	/**
	 * Find first location of specified value
	 * @param arr - array of integers
	 * @param value - value being searched for
	 * @return - index of the first occurrence of value
	 */
	public static int findFirst(int[] arr, int value) {
		int counter = 0;
		for (int element : arr) {
			if (element == value) {
				return counter;
			}
			counter++;
		}
		return -1;
	}

	/**
	 * Determines if a specified value is in an array
	 * @param arr - array of integers
	 * @param value - value being searched for
	 * @return - true if element found, false otherwise
	 */
	public static boolean find(int[] arr, int value) {
		for (int element : arr) {
			if (element == value) {
				return true;
			}
		}
		return false;
	}

	//added for mode


	// determine if there are any duplicates (existance only) return T/F
	public static boolean duplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

	// determine how many times a specified element is duplicated, 
	// if at all

	/**
	 * Counts how many times an item is duplicated, not including
	 * the first instance
	 * @param arr - input array of ints
	 * @param value - value being checked for duplications
	 * @return number of times an element is dupicated
	 */
	public static int duplicateCount(int[] arr, int value){
		int count = 0;
		for(int element:arr){
			if(element == value){
				count++;
			}
		}
		return count-1;
	}

	/**
	 * Counts how many times the value shows us in arr
	 * @param arr - array to be searched
	 * @param value - value being counted
	 * @return number of times the elmement shows up
	 */
	public static int numOccurrences(int[] arr, int value){
		int count = 0;
		for(int element:arr){
			if(element == value){
				count++;
			}
		}
		return count-1;
	}

	/**
	 * Find the smallest integer in an array
	 * @param arr - an array of integers
	 * @return the smallest value in the array
	 */
	public static int min(int[] arr) {
		int min = arr[0];
		for (int element : arr) {
			if (element < min) {
				min = element;
			}
		}
		return min;
	}

	// find and return max

	/**
	 * Finds the largest value in an array
	 * @param arr - array of integers
	 * @return largest value in the array
	 */
	public static int max(int[] arr) {
		int max = arr[0];
		for (int element : arr) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}

	// find and return range

	/**
	 * Find the range of an array
	 * @param arr - array of integers
	 * @return the range of the array
	 */
	public static int range(int[] arr) {
		return max(arr) - min(arr);
	}


	/**
	 * Finds the average of an array of integers
	 * @param arr - array of integers
	 * @return the average of the elements of the array
	 */
	public static double average(int[] arr) {
		double sum = 0;
		for (int element : arr) {
			sum += element;
		}
		return sum/arr.length;
	}


	// find and return the mode (advanced CS A)

	/**
	 * Finds the mode of an array
	 * @param arr - array of integers
	 * @return mode of the array, first one found if more than one
	 */
	public static int mode(int[] arr){
		int maxValue = Integer.MIN_VALUE;
		int maxCount = 0;
		for(int i = 0; i<arr.length;i++){
			int count = 0;
			for(int j = 0; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count > maxCount){
				maxCount = count;
				maxValue = arr[i];
			}
		}
		return maxValue;
	}


	/**
	 * Java method to rotate a given array to the left specified by numOfRotations
	 * times
	 * 
	 * @param input - array of integers
	 * @param length - length of array
	 * @param numOfRotations - how many times to rotate the array
	 * @return rotated array
	 */
	public static int[] rotateLeft(int[] input, int length, int numOfRotations){
		int[] rotatedArray = new int[length];
		for(int i = 0; i<length;i++){
			rotatedArray[i] = input[i];
		}
		for(int i = 0; i<numOfRotations; i++){
			int temp = rotatedArray[0];
			for(int j = 0; j<length-1; j++){
				rotatedArray[j] = rotatedArray[j+1];
			}
			rotatedArray[length-1] = temp;
		}
		return rotatedArray;
	}

	/**
	 * Java method to rotate a given array to the right specified by
	 * numOfRotations times
	 * 
	 * @param input - array of integers
	 * @param length - length of array
	 * @param numOfRotations - how many times to rotate the array
	 * @return rotated array
	 */
	public static int[] rotateRight(int[] input, int length, int numOfRotations){
		int[] rotatedArray = new int[length];
		for(int i = 0; i<length;i++){
			rotatedArray[i] = input[i];
		}

		for(int i = 0; i<numOfRotations; i++){
			int temp = rotatedArray[length-1];
			for(int j = length-1; j>0; j--){
				rotatedArray[j] = rotatedArray[j-1];
			}
			rotatedArray[0] = temp;
		}
		return rotatedArray;
	}

}
