interface Printable{
	void print();
	int min=5;
	
}
public class InterfaceClass implements Printable {
	public void print() {
		System.out.println("interface method implemented");
	}
}
class TestClass {
	public static void main(String[] args) {
		Printable i=new InterfaceClass();
		i.print();
		System.out.println(i.min);
	}
}