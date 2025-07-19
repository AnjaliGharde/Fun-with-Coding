package Questions;

public class PallindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int real=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev = rev*10+digit;
			num=num/10;
			
		}
		if(real==rev) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
