//앞으로 많이 사용할 구문=> 자료를 서로 맞바꿀때=>대입연산자 (=)
public class Switch_assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=3;
		int temp;
		System.out.println("교환전 a : "+a); //5
		System.out.println("교환전 b : "+b); //3
		
		//교환
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("교환후 a : "+a); //3
		System.out.println("교환후 b : "+b); //5
		
	}
}
