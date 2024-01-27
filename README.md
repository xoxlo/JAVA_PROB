# 별 다이아몬드 찍기
~~~
public class Prob1 {
	static void star(int num) { // 정적 메소드 - static은 프로그램이 실행할 때부터 끝날 때까지 계속 메모리에 할당됨. 객체 생성 따로 안해도 사용 가능
		for (int i = 0; i < num; i++) {  // 상단 피라미드
			
			for(int j = 0; j < num - i; j++) { // 공백 출력 - 하나씩 줄여가면서 삼각형 형태로 만들어줌
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i)+1 ; k++) { // 별 출력 - 홀수개 만큼만 출력
				System.out.print("*");
			}
			System.out.println(); // 개행
		}
		for (int i = num - 1; i > 0; i--) {  // 하단 피라미드 - 처음 행은 출력 하지 않음 (-1을 하는 이유 ? 다이아몬드로 만들기 위해서는 한 칸 띄고 시작함)
			
			for(int j = 0; j < num - i + 1; j++) { // 공백 출력 - 하나씩 늘여가면서 삼각형 형태로 만들어줌 ( +1을 하는 이유 ? 하단 피라미드 첫시작은 행을 하나 건너뛰고 그 다음부터 출력하기 때문에 처음 시작 할 때도 공백을 하나 더 추가 해주기 위함)
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i)-1; k++) { // 별 출력 - 홀수개 만큼만 출력. i가 0일때는 없으니까 위와는 다르게 2*i-1로 조건
				System.out.print("*");
			}
			System.out.println(); // 개행
		}
	}
	public static void main(String[] args) {
		star(5); // 따로 객체화를 안해도 바로 star메소드를 호출 가능함
	}
}
~~~

# 구구단 for문만 이용
~~~
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
~~~

# 구구단 2차원 배열 이용
~~~
public class Prob2_2 {
	public static void main(String[] args) {
		int[][] gugudan = new int[9][9];	// 크기가 행9, 열9 인 2차원 배열 생성
		for ( int dan = 0; dan < 9; dan++) {	// 1단부터 9단
			for ( int i = 0; i < 9 ; i++) {	// x1 , x2 , ..... x9까지
				gugudan[dan][i] = (dan+1)*(i+1);	// 초기값이 0이니까 +1 해서 곱해줌
			}
		}
		System.out.println("X  1  2  3  4  5  6  7  8  9");	// 첫번째 행
		for ( int dan = 0; dan < 9; dan++) {	// 9단까지 반복
			System.out.printf("%-1d",dan+1);	// 세로 열 하나를 먼저 출력
			for ( int i = 0; i < 9 ; i++) {
				System.out.printf("%3d", gugudan[dan][i]);	// 구구단 출력
			}
			System.out.println();
		}
	}
}
~~~~
