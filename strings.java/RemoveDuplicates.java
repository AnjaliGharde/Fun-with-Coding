package Strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Apple";
		String result = "";
		char ch;
		
		for(int i=0;i<=str.length()-1;i++) {
			ch = str.charAt(i);
			
			if(result.indexOf(ch)==-1) {
				result = result+ch;
			}
		}
				System.out.println("The output is: " + result );
		

	}

}
