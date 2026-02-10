import java.util.Arrays;
class ArrayExample2{
	public static void main(String[] args) {
		int [] arr1 = new int[10];
		System.out.println(Arrays.toString(arr1));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        int [] arr2 = new int[0];
        System.out.println(Arrays.toString(arr2));//[]
        // int [] arr3 = new int[-12];
        // System.out.println(Arrays.toString(arr3));//Exception in thread "main" java.lang.NegativeArraySizeException: -12
        int [] arr4 = new int[Integer.MAX_VALUE];
        System.out.println(Arrays.toString(arr4));//Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
        // int [] arr5 = new int[1234567890123];
        // System.out.println(Arrays.toString(arr5));// integer number too large
        // int [] arr6 = new int[123l];
        // System.out.println(Arrays.toString(arr6));//incompatible types: possible lossy conversion from long to int
	}
}