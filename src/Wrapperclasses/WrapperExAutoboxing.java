package Wrapperclasses;

public class WrapperExAutoboxing {
	public static void main(String[] args) {
		int a=20;
		Integer i=a;
		Integer j=Integer.valueOf(a);
		System.out.println(a+" "+i+" "+j);
	}

}
