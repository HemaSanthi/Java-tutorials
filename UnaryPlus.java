package sample;
import java.util.Scanner;
public class UnaryPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int plus,a;
		Scanner s = new Scanner(System.in);
		System.out.println("enter value");
		plus = s.nextInt();
		a=+plus;
		System.out.println(a);
		a=-plus;
		System.out.println(a);

	}

}
