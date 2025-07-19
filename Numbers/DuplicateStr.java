package Questions;

public class DuplicateStr{
    public static void main(String[] args) {
        String input = "programming";

        System.out.println("Duplicate characters:");
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int count = 0;

     
            boolean isCounted = false;
            for (int k = 0; k < i; k++) {
                if (input.charAt(k) == ch) {
                    isCounted = true;
                    break;
                }
            }

            if (isCounted)
                continue;

          
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(ch + " → " + count + " times");
            }
        }
    }
}
