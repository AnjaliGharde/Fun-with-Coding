package Questions;

//import java.util.Scanner;

public class XylomPhloem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num=1234;
		 int last=num%10;
		 num=num/10;
		 int sum=0;
		 
		 while(num>9) {
			 int rem=num%10;
			 sum=sum+rem;
			 num=num/10;
		 }
		 if(last+num==sum) {
			 System.out.println("Xylem");
		 }else {
			 System.out.println("phloem");
		 }
	}
				
}
