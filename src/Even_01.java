import java.util.Scanner;

//숫자를 입력받아 짝수인지 판별하는 프로그램을 작성하라.
public class Even_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언
		int num;
		//입력
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력: ");
		num=scan.nextInt();
		//처리
		if(num!=0) {  //if안에 if문을 넣어도 된다.
			if(num%2==0) {
			System.out.println("짝수");
			}
			else {//num%2!=0
				System.out.println("홀수");
			}
		}
	}
}
