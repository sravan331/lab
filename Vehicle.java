package inheritanceprogs;
  // program on hierarchical inheritance for vehicle
public class Vehicle {  //parent class
void run() {
	System.out.println("running mode on for the vehicles ");
}}
class Bike extends Vehicle {  //child class(Bike) inherit from parent class not occuring
	void features() {
		System.out.println("well executed and balanced features ");
	}}
class Bmw extends Vehicle {  // child class(Bmw) inherits properties from parent class
	void speed() {
		System.out.println("very high speed compare to others ");
	}
}
class Testsingleinherit {  // main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bmw d = new Bmw();  //object of child class Bmw
d.run();
//d.features(); not able to take from child class Bike
d.speed();

	}
}






	

