import java.util.Scanner;

//정수의 절댓값을 구하는 프로그램을 작성해보자. 이때 정수값을 키보드로 입력 받는다.
public class Absolute_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int result;
		int num1=scan.nextInt();
		if(num1>=0) {
			System.out.println("절댓값: "+(num1));
		}else {
			System.out.println("절댓값: "+(-(num1))); //(num1*(-1)); =>스위치
		}
		//삼항연산자(3)=if~ else
		//단항(1) ++ --   이항(2) 산술,논리,비교
		result=(num1>=0)? num1 : num1*(-1);
		System.out.println(result);
		
		
	}
	
}



















