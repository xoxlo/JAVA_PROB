package prob;

public class Prob1 {
	static void star(int num) { // 정적 메소드 - static은 프로그램이 실행할 때부터 끝날 때까지 계속 메모리에 할당됨.
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
			for(int k = 0; k < (2*i)-1; k++) { // 별 출력 - 홀수개 만큼만 출력
				System.out.print("*");
			}
			System.out.println(); // 개행
		}
	}
	public static void main(String[] args) {
		star(5); // 따로 객체화를 안해도 바로 star메소드를 호출 가능함
	}
}
