package Questions;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the number");
    	int num = sc.nextInt();
 
        int real = num;
        int count = 0;

         
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        int sum = 0;
        temp = num;  
        while (temp > 0) {
            int a = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * a;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (real == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
