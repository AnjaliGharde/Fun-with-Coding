package Questions;

import java.util.Scanner;

public class PerfectNum {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
//		int num=6;
		int divisor=1;
		int p=0;
		while(divisor<num) {
			if(num%divisor==0) {
				p=p+divisor;
 			}
			divisor++;
		}
		
		if(num==p) {
			System.out.println("perfect");
		}else {
			System.out.println("not perfect");
		}
	}

}
