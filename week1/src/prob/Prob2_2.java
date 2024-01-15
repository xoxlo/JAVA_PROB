package prob;

public class Prob2_2 {
	public static void main(String[] args) {
		int[][] gugudan = new int[9][9];
		for ( int dan = 0; dan < 9; dan++) {
			for ( int i = 0; i < 9 ; i++) {
				gugudan[dan][i] = (dan+1)*(i+1);
			}
		}
		System.out.println("X  1  2  3  4  5  6  7  8  9");
		for ( int dan = 0; dan < 9; dan++) {
			System.out.printf("%-1d",dan+1);
			for ( int i = 0; i < 9 ; i++) {
				System.out.printf("%3d", gugudan[dan][i]);
			}
			System.out.println();
		}
	}
}
