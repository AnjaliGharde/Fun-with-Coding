package Questions;

public class NeonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num=9;
		 int sq = num*num;
		 int sum=0;
		 while(sq>0) {
			 int a=sq%10;
			 sum=sum+a;
			 sq=sq/10;
		 }
		if(sum==num) {
			System.out.println("neon");
		}else {
			System.out.println(" not neon");

		}
		
		 
		
	}

}
