import java.util.Scanner;

//舛呪税 箭奇葵聖 姥馬澗 覗稽益轡聖 拙失背左切. 戚凶 舛呪葵聖 徹左球稽 脊径 閤澗陥.
public class Absolute_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("舛呪 脊径: ");
		int result;
		int num1=scan.nextInt();
		if(num1>=0) {
			System.out.println("箭奇葵: "+(num1));
		}else {
			System.out.println("箭奇葵: "+(-(num1))); //(num1*(-1)); =>什是帖
		}
		//誌牌尻至切(3)=if~ else
		//舘牌(1) ++ --   戚牌(2) 至綬,轄軒,搾嘘
		result=(num1>=0)? num1 : num1*(-1);
		System.out.println(result);
//		System.out.println("ぞぞぞぞぞぞぞぞ");
		
		
	}
	
}



















