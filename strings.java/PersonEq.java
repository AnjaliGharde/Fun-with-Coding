//Override the equals() method so two people are equal if both name and age match.
 

package Strings;

public class PersonEq {
	
	String name;
	int age;
	
	PersonEq(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)  
		return true;
		if(obj==null || getClass()!=obj.getClass())
			return false;
		
		PersonEq other = (PersonEq)obj;
		 return this.age==other.age && this.name.equals(other.name);
			 
		 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PersonEq p1 = new PersonEq("Alice", 25);
	     PersonEq p2 = new PersonEq("Alice", 25);
	     PersonEq p3 = new PersonEq("Bob", 30);   

	        System.out.println(p1.equals(p2));  
	        System.out.println(p1.equals(p3));//false
	}

}
