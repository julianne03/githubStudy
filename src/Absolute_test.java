import java.util.Scanner;

//������ ������ ���ϴ� ���α׷��� �ۼ��غ���. �̶� �������� Ű����� �Է� �޴´�.
public class Absolute_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int result;
		int num1=scan.nextInt();
		if(num1>=0) {
			System.out.println("����: "+(num1));
		}else {
			System.out.println("����: "+(-(num1))); //(num1*(-1)); =>����ġ
		}
		//���׿�����(3)=if~ else
		//����(1) ++ --   ����(2) ���,��,��
		result=(num1>=0)? num1 : num1*(-1);
		System.out.println(result);
		
		
	}
	
}



















