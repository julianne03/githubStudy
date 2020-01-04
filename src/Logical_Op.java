//1부터 100사이의 숫자 중 1의 자리가 3,6,9인 수를 찾아보자
/*%연산자를 이용한다.
 * 1의 자리를 표현하는 방법을 생각한다.
 * != , ==, &&연산자를 적절히 사용한다.
 */
public class Logical_Op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i=1; i<=100; i++) {
			if(i%10==3 || i%10==6 || i%10==9) {	
				System.out.println(i+"  1의 자리가 3,6,9인 수");	
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