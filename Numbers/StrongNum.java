package Questions;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=145;
		int sum=0;
		int b=num;
		
		while(num>0) {
			int a =num%10;
			int fact=1;
			for(int i=1;i<=a;i++) {
				fact*=i;
			}
			sum=sum+fact;
			num=num/10;
		}
		
		if(sum==b) {
			System.out.println("the number is Strong number");
		}else {
			System.out.println("the number is not strong number");
		}
	}

}
