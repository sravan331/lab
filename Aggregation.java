package inheritanceprogs;

public class Aggregation {   // class 1
	int square(int n) {
		return n*n;
	}
}
class circle {  //class 2
Aggregation ag; // object entity(ref line)
double pi=3.14;
double area(int radius) {
	ag=new Aggregation();
	int psquare = ag.square(radius);
	return pi*psquare;
	
}
public static void main(String[] args) {  // main method
		// TODO Auto-generated method stub
circle c=new circle();
double result=c.area(5);  // area of circle=pi*r*r
System.out.println(result);
}

	}


