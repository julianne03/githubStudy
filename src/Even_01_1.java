import java.util.Scanner;

//���ڸ� �Է¹޾� ¦������ �Ǻ��ϴ� ���α׷��� �ۼ��϶�.
public class Even_01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1;
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�: ");
		sum1=scan.nextInt();
		
		if(sum1%2==0) {
			System.out.println("¦��");
		}
		else {
			System.out.print("Ȧ��");
		}

	}

}
