import java.util.Scanner;

//���ڸ� �Է¹޾� ¦������ �Ǻ��ϴ� ���α׷��� �ۼ��϶�.
public class Even_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		int num;
		//�Է�
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�: ");
		num=scan.nextInt();
		//ó��
		if(num!=0) {  //if�ȿ� if���� �־ �ȴ�.
			if(num%2==0) {
			System.out.println("¦��");
			}
			else {//num%2!=0
				System.out.println("Ȧ��");
			}
		}
	}
}
