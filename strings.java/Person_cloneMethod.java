package Strings;

public class Person_cloneMethod implements Cloneable {
	
	String name;
	int age;
	
	Person_cloneMethod(String name,int age){
		this.name=name;
		this.age=age;
	}

	public Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		

		Person_cloneMethod a = new Person_cloneMethod("Ram",34);
		Person_cloneMethod a1 = (Person_cloneMethod) a.clone();
		
		System.out.println("Original: " + a.name + " " + a.age);
		System.out.println("Cloned: " + a1.name + " " + a1.age);

	}

}
