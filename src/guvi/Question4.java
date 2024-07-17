package guvi;
class Person1{
	String name;
	int age;
	public Person1() {
		
	}
	public Person1(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
class Employee extends Person1{
	String empId;
	int salary;
	
		public Employee() {
			super("Panneer selvam",25);
		}
		public Employee(String empId,int salary) {
			super("Panneer selvam",25);
			this.empId=empId;
			this.salary=salary;
		}
		public void display() {
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Employee Id:"+empId);
			System.out.println("Salary:"+salary);
		
	}
}
public class Question4 {

	public static void main(String[] args) {
		Employee emp=new Employee("Emp111",100000);
		emp.display();

	}

}

