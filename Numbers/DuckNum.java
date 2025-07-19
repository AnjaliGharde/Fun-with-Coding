package Questions;

import java.util.Scanner;

public class DuckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=1023;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int a=1;
		while(num>0) {
			int digit=num%10;
			a=a*digit;
			num=num/10;
		}
		while(temp>10) {
			temp=temp/10;		
		}
		if(a==0 && temp!=0) {
			System.out.println("Number is Duck number");
		}else {
			System.out.println("Number is not Duck number");
		}
		
		 
	}

}
