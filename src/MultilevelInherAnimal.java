
public class MultilevelInherAnimal{
	void eat(){
		System.out.println("Eating");
	}
}
class Doggg extends MultilevelInherAnimal{
	void bark(){
		System.out.println("Barking");
	}
}
class BabyDog extends Doggg{
	void weep(){
		System.out.println("Weeping");
	}
}