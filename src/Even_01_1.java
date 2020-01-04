import java.util.Scanner;

//숫자를 입력받아 짝수인지 판별하는 프로그램을 작성하라.
public class Even_01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1;
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력: ");
		sum1=scan.nextInt();
		
		if(sum1%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.print("홀수");
		}

	}

}
