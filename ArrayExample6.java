
// import java.util.Arrays;
// class ArrayExample6{
// 	public static void main(String[] args) {
// 		int [] arr = {1,2,3,4,5,6,7,8,9,10};
// 		for(int ele : arr){
// 			if(isPrime(ele))
// 				System.out.print(ele+" ");
// 		}
// 	}
// 	public static boolean isPrime(int num){
// 		if (num<2) return false;
// 		for(int i = 2 ; i<=num/2; i++){
// 			if(num%i==0) 
// 				return false;
// 		}
// 		return true;
// 	}
// }







import java.util.* ;
class ArrayExample6{
	public static void main(String[] args) {
		int [] arr = new int[15];
		int sum = 0;
		for(int i = 0; i< arr.length ; i=i+2){
			arr[i] = (int)(Math.random()*100);
			sum = sum + arr[i];
		}    
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}
}
