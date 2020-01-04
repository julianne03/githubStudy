//1부터 100사이의 숫자 중 3의 배수이면서 5의 배수인 수를 구해보자.
public class Multiple_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=100; i++) {
			if((i%3==0) && (i%5==0)) {
				System.out.println("3의 배수이면서 5의 배수");
			}else {
				System.out.println("3의 배수이면서 5의 배수가 아닌 수");
			}
		}

	}

}
