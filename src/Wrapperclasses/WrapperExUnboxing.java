package Wrapperclasses;

public class WrapperExUnboxing {
	public static void main(String[] args) {
		Integer a=20;
		Integer b=new Integer(40);
		int i=a;
		int j=b;
		int k=a.intValue();
		int l=a.intValue();
		System.out.println(a);
		System.out.println(b);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}

}
