package inheritanceprogs;
// single inheritance program on employee 
public class Employees {  //parent class

	int sal=50000;
}
class Inherit extends Employees {  //child class inherit from parent class
	int bon=100000;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
Inherit b= new Inherit();  // object of the child class
System.out.println("salary for the person is "+b.sal);
System.out.println("bonus of the performance is "+b.bon);
	}

}
