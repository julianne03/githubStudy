//1���� 100������ ���� �� 1�� �ڸ��� 3,6,9�� ���� ã�ƺ���
/*%�����ڸ� �̿��Ѵ�.
 * 1�� �ڸ��� ǥ���ϴ� ����� �����Ѵ�.
 * != , ==, &&�����ڸ� ������ ����Ѵ�.
 */
public class Logical_Op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i=1; i<=100; i++) {
			if(i%10==3 || i%10==6 || i%10==9) {	
				System.out.println(i+"  1�� �ڸ��� 3,6,9�� ��");	
			}
		}*/
		//2.
		for (int i=1; i<=100; i++) {
			if((i%10)%3==0 && (i%10!=0)) {
				System.out.println(i);
			}
		}
	}
}          