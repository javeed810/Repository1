class MethodOverriding2{
  void run(){System.out.println("Vehicle is running");
  }
}
  class Bike extends MethodOverriding2{
   void run(){System.out.println("Bike is running");
  }
  public static void main(String args[]){
	  MethodOverriding2 obj = new Bike();
  obj.run();
  }
}