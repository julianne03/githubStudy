//1부터 100사이의 숫자 중 3의 배수인 수를 구해보자.
/*%연산자를 이용한다.
 * 3의 배수는 3으로 나누어 나머지가 0인 수
 * 반복문 for(초기화; 조건식; 증감식){실행...}을 이용한다. */
public class Multiple_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i+"  3의 배수");
			}else {
				System.out.println(i+"  3의 배수가 아니다");
			}
		}
	}
}

