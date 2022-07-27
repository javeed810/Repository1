
public class MethodOverloading {
	public static  void add(double a, double b) {
	System.out.println(a+b);
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		MethodOverloading.add(11, 11);
		MethodOverloading.add(2, 2, 2);
	}

}
