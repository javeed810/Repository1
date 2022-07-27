
public class Superkeyword {
	int i;
	String name;
	Superkeyword(int i,String name){
		this.i=i;
		this.name=name;
	}
}
class Child extends Superkeyword{
	float salary;
	Child(int i, String name,float salary) {
		super(i, name);
		this.salary=salary;
	}
	void display() {
		System.out.println(i+" "+name+" "+salary);
	}
}
class Test{
	public static void main(String[] args) {
		Child c=new Child(100,"Rahul",5600.00f);
		c.display();
	}
}