package Questions;

//import java.util.Scanner;

public class SpyNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=123;
     int sum=0;
     int prod=1;
     
     while(num>0) {
    	 num=num%10;
    	 sum=sum+num;
    	 prod=prod*num;
    	 num=num/10;
    			
     }
     if(sum==prod) {
    	 System.out.println("Spy");
     }else {
    	 System.out.println("not Spy");
     }
	}

}

 