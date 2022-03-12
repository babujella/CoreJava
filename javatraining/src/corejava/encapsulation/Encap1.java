package corejava.encapsulation;


class Account{
	private String name;
	private String email;
	private float salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
}
	public class Encap1 {
	public static void main(String[] args) {
		Account B=new Account();
		B.setName("Babu");
		B.setEmail("babu.j@techouts.com");
		B.setSalary(48500.49f);
		
		System.out.println(B.getName()+ " "+B.getEmail()+" " +B.getSalary());
	

}}
