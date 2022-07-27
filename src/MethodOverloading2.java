
public class MethodOverloading2 {
	public static void add1(int a,double b) {
		System.out.println(a+b);
	}
	public static void add1(double a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverloading2.add1(2, 2.0);
		MethodOverloading2.add1(1.0, 1);
	}

}
