package sample;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=5,e;
		e=num1&num2;
		System.out.println("& Operator"+ e);
		e=num1|num2;
		System.out.println("| Operator"+ e);
		e=num1^num2;
		System.out.println("^ Operator"+ e);
		e=~num1;
		System.out.println("~ Operator"+ e);
		e=~num2;
		System.out.println("~ Operator"+ e);

	}
