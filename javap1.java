class information{
	int id;
	int salary;
	String name;
	public void printDetails(){
		System.out.println("my id is"+id);
		System.out.println("my name is"+name);
	}
	
	public int getSalary(){
		return salary;
	}
	
}
public class Employee {
 public static void main(String args[]){
	 System.out.println("This is custom class");
	 information el= new information();
	 information e2=new information();
	 e1.id = 12;
	 e1.salary = 20000;
	 e1.name = "sneha";
	 e2.id = 22;
	 e2.salary = 30000;
	 e2.name = "nehu";
	 e1.printDetails();
	 e2.printDetails();
	 
	System.out.println("Salary");
	 
			 
 }
}
