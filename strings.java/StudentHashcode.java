//Create a class Student and print the hashCode() of different students.
package Strings;

public class StudentHashcode {

	String name;
	
	StudentHashcode(String name){
		this.name=name;
	}
	
	public int hashCode() {
		return name.hashCode();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentHashcode a= new StudentHashcode("Ram");
		a.hashCode();
		System.out.println(a);
		
	}

}
//Important Note:
//If you override hashCode(), you should also override equals() 
//if you want two objects with the same data to be fully equal.
//
//Without equals(), Java will still think they are different objects even 
//if hashCode() is the same.