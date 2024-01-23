package prob;

public class Prob2 {
	public static void main(String[] args) {
		gugudan_for(10);
	}
	static void gugudan_for(int num) { // 정적 메소드
		int dan = num;
		System.out.print("X "); // 처음 X , .... 출력
		for( int l = 1; l <= num; l++) { // 1단부터 매개변수로 대입한 수의 단까지 X 1 2 3 .... 형태로 출력
			System.out.printf("%2d ",l);
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) { // i는 1~9
			System.out.printf("%-2d",i); // 세로 열 하나를 먼저 출력
			for (int j = 1; j <= dan; j++) { // j는 단수를 나타냄
				System.out.printf("%2d ", j*i); // 결과값 출력
			}
			System.out.println(); // 다음 단수로 진행할 개행
		}
	}
}
