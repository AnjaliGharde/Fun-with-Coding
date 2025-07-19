package Questions;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=76;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sq=num*num;
 
		sq=sq%100;
		if(sq==num) {
			System.out.println("Number is Automorphic");
		}else {
			System.out.println("Number is not Automorphic");
		}
	}

}
