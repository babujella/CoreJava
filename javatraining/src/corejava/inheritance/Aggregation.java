package corejava.inheritance;

	class Address{
		String city;
		String area;
		String country;
		Address(String city,String area,String country) {
			this.city=city;
			this.area=area;
			this.country=country;
		}
	}
		class Employee{
			String name;
			Integer id;
			Address address;
			public void run(String name,Integer id,Address address) {
				System.out.println(name+" "+id+" "+" "+address.city+address.area+address.country);
			}
		}
	public class Aggregation {
	public static void main(String[] args) {
		Address b=new Address("Hyderabad","Gachibowli","India");
		Address b1=new Address("Hyderabad","Gachibowli","India");

		Employee e=new Employee();
		Employee e1=new Employee();
		e.run("Babu",1839,b);
		e1.run("Babu",1839,b1);
	}

}


