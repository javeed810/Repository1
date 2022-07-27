
public class MethodOverriding {
	public void eat() {
		System.out.println("Animals eat");
	}
	public static void main(String[] args) {
		MethodOverriding mp=new MethodOverriding();
		mp.eat();
		MethodOverridingChild mpc=new MethodOverridingChild();
		mpc.eat();
		//MethodOverriding mpcu=new MethodOverridingChild();
	}
}
class MethodOverridingChild extends MethodOverloading{
		protected void eat() {
			System.out.println("Dog eat");
		}
		
	
}
