import java.util.Arrays;
class ArrayExample3{
	public static void main(String[] args) {
		
		char []a = new char[3];
		a[0] = 'a';
		a[1] = 'b';
		a[2] = 'c';
		System.out.println(Arrays.toString(a)); //[a, b, c]

		short [][]b = new short[2][3]; // This is a Matrix Array
		b[0][0] = 10;
		b[0][1] = 20;
		b[0][2] = 30;
		b[1][0] = 40;
		b[1][1] = 50;
		b[1][2] = 60;
        System.out.println(Arrays.deepToString(b));//[[10, 20, 30], [40, 50, 60]]

        boolean [][]c = new boolean[3][]; // This is a Jagged Array
        c[0] = new boolean[1];
        c[1] = new boolean[2];
        c[2] = new boolean[3];
        c[0][0] = true;
        c[1][0] = true;
        c[1][1] = false;
        c[2][0] = false;
        c[2][1] = true;
        c[2][2] = true;
        System.out.println(Arrays.deepToString(c));//[[true], [true, false], [false, true, true]]
	}
}