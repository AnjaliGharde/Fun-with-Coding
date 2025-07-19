package Questions;

public class BounceNum {
    public static void main(String[] args) {
        int number = 12321;  
        int num = number;

        int lastDigit = num % 10;
        num = num / 10;
        int direction = 0;  

        boolean isBounce = false;

        while (num > 0) {
            int currentDigit = num % 10;

            if (currentDigit < lastDigit) {
                if (direction == 0) {
                    direction = 1;  
                } else if (direction == -1) {
                    isBounce = true;
                    break;
                }
            } else if (currentDigit > lastDigit) {
                if (direction == 0) {
                    direction = -1;  
                } else if (direction == 1) {
                    isBounce = true;
                    break;
                }
            }

            lastDigit = currentDigit;
            num = num / 10;
        }

        if (isBounce) {
            System.out.println(number + " is a Bounce Number.");
        } else {
            System.out.println(number + " is NOT a Bounce Number.");
        }
    }
}
