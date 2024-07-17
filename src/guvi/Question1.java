package guvi;

import java.util.Scanner;

class Person{
	int age;
	String name;

public Person() {
	age=18;
}
public Person(int age,String name) {
	this.age=age;
	this.name=name;
}
public void display() {
	System.out.println("The age is:"+age);
	System.out.println("The name is :"+name);
}
}
public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person p=new Person();
		System.out.println("Enter the Name of the person:");
		p.name=scan.next();
		p.display();

	}

}
