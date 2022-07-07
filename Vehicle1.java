package inheritanceprogs;
  // program on multilevel inheritance for vehicle
public class Vehicle1 {  // parent class
	void run() {
		System.out.println("running mode on  ");
	}
	
	}
class Bike1 extends Vehicle1 {  // child class(Bike) inherit from parent class(vehicle1)
	void features() {
		System.out.println("well designed features ");
	}
	}
class Bmw1 extends Bike1 {  //child class(Bmw) inherit from child class(Bike) 
	void speed() {
		System.out.println("the speed is very nice  ");
	}
	}
class Testing {   // main class
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
Bmw1 d=new Bmw1();  // calling both the child class in this main class
d.run();
d.features();
d.speed();
	}

}
