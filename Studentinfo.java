package inheritanceprogs;

public class Studentinfo {

	int id;
	String name;
	Address address;
	public Studentinfo(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
			}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address address1=new Address("mvp","vizag","ap");
Address address2=new Address("nad","vizag","ap");
Studentinfo s=new Studentinfo(10,"ravi",address1);
Studentinfo s1=new Studentinfo(12,"dhanu",address2);
s.display();
s1.display();

	}

}
