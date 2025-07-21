//create a system for printing employee records in a company.
//Each Employee has the following details:
//id (int)
//name (String)
//department (String)
//salary (double)

package Strings;

public class EmployeeToString {

	int id;
	String name;
	String department;
	double salary;
	
	EmployeeToString(int id,String name,String department,double salary){
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public String toString() {
		return "id: " + id +",name: " +name + ",department: "+ department +",salary: " + salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeToString a =new  EmployeeToString(12,"Ram","Computer",30000);
		a.toString();
		System.out.println(a);
	}

}
