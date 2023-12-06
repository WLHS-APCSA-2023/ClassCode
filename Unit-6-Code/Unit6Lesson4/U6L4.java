import java.util.Arrays;

public class U6L4 {
	public static void main(String[] args) {
		// test code here

		//possible array you could use, might want smaller to start
		int[] arrayOInts = {8,2,-11,4,0,-3,5,21,37,
		-47,Integer.MAX_VALUE,4,5,3,7,42,13,28,4};



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

	// return the index of the first occurence of a 
	// specified element in an array, -1 if not found

	// determine if there are any duplicates (existance only) return T/F

	// determine how many times a specified element is duplicated, 
	// if at all

	// find and return min

	// find and return max

	// find and return range

	// find and return average


	// find and return the mode (advanced CS A)


	////Extra if time////

	/**
	 * Java method to rotate a given array to the left specified by numOfRotations
	 * times
	 * 
	 * @param input
	 * @param length
	 * @param numOfRotations
	 * @return rotated array
	 */

	/**
	 * Java method to rotate a given array to the right specified by
	 * numOfRotations times
	 * 
	 * @param input
	 * @param length
	 * @param numOfRotations
	 * @return rotated array
	 */

}
