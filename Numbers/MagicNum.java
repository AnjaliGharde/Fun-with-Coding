package Questions;

import java.util.Scanner;

public class MagicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 1729;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
        int sum = num;

        while (sum > 9) {
            int temp = sum;
            sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
        }
        if (sum == 1) {
            System.out.println(num + " is a Magic Number");
        } else {
            System.out.println(num + " is Not a Magic Number");
        }
		
	}

}
