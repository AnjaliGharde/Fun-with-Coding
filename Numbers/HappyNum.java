 package Questions;

public class HappyNum {

    public static void main(String[] args) {
        int num = 19;
        int digit, sum, temp;
       
        while (num != 1 && num != 4) {
           
        	  sum = 0;
              temp = num;

            while (temp > 0) {
                digit = temp % 10;
                sum = sum + (digit * digit);
                temp = temp / 10;
            }

            num = sum;  // repeat with new sum
        }

        if (num == 1) {
            System.out.println("happy");
        } else {
            System.out.println("not happy");
        }
    }
}
