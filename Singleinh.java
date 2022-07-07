package inheritanceprogs;
// program on single inheritance addition of numbers
public class Singleinh { //class1
int a=800;
}
class Singleinh1 extends Singleinh {  //class 2 inherit class 1 properties
	int b=40;
	int c=a+b;

	public static void main(String[] args) {  //main class
		
Singleinh1 obj=new Singleinh1();
System.out.println("the addition of the values is  "+obj.c);

	}
}


