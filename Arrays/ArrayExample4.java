import java.util.Arrays;

class ArrayExample4 {
	public static void main(String[] args) {
		
		//1.Matrix Array
		int [][][] a = new int[2][2][2];
		a[0][0][0] = 1; 
		a[0][0][1] = 2; 
		a[0][1][0] = 3; 
		a[0][1][1] = 4; 
		a[1][0][0] = 5; 
		a[1][0][1] = 6; 
		a[1][1][0] = 7; 
		a[1][1][1] = 8;
		System.out.println(Arrays.deepToString(a)); // [[[1, 2], [3, 4]], [[5, 6], [7, 8]]]

		//2.Jagged Array
		long [][][] b = new long[2][1][];
		b[0][0] = new long[2];
		b[1][0] = new long[3];
		b[0][0][0] = 10;
		b[0][0][1] = 20;
		b[1][0][0] = 30;
		b[1][0][1] = 40;
		b[1][0][2] = 50;
		System.out.println(Arrays.deepToString(b)); // [[[10, 20]], [[30, 40, 50]]]

        //3.Matrix Array
		double [][][] c = new double[1][2][2];
		c[0][0][0] = 1.0;
		c[0][0][1] = 2.0;
		c[0][1][0] = 3.0;
		c[0][1][1] = 4.0;
		System.out.println(Arrays.deepToString(c)); // [[[1.0, 2.0], [3.0, 4.0]]]

		//4.Jagged Array
		char [][][] d = new char[1][2][];
		d[0][0] = new char[2];
		d[0][1] = new char[3];
		d[0][0][0] = 'a';
		d[0][0][1] = 'b';
		d[0][1][0] = 'c';
		d[0][1][1] = 'd';
		d[0][1][2] = 'e';
		System.out.println(Arrays.deepToString(d));// [[[a, b], [c, d, e]]]

		//5.Jagged Array
		int [][][] e = new int[2][][];
		e[0] = new int[1][2];
		e[1] = new int[2][2];
		e[0][0][0] = 10;
		e[0][0][1] = 20;
		e[1][0][0] = 30;
		e[1][0][1] = 40;
		e[1][1][0] = 50;
		e[1][1][1] = 60;
		System.out.println(Arrays.deepToString(e)); // [[[10, 20]], [[30, 40], [50, 60]]]
	}
}