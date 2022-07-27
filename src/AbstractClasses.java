
abstract class AbstractClassBike {
	AbstractClassBike(){
		System.out.println("Bike class constructor");
	}
	abstract void run();
	void gearUp() {
		System.out.println("Gear running properly");
	}
}
class Honda extends AbstractClassBike{

	@Override
	void run() {
		System.out.println("Honda class run method");
	}
	
}
class TeSting{
	public static void main(String[] args) {
		AbstractClassBike obj=new Honda();
		obj.run();
		obj.gearUp();
	}
}
