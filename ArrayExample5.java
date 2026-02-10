import java.util.Arrays;
class ArrayExample5{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);


		//for loop
		for (int i = 0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");

		//while loop
		int i= 0;
		while(i<arr.length){
            System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println("\n");

		//do-while loop
		i = 0;
		do{
			System.out.print(arr[i]+" ");
			i++;
		}while(i<arr.length);
		System.out.println("\n");

		//for each loop
		for(int ele : arr){
			System.out.print(ele+" ");
		}
	}
}