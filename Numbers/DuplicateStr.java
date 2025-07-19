package Questions;

public class DuplicateStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		int count=0;
		char a;
		for(int i=0;i<=str.length()-1;i++) {
			 a=str.charAt(i);
			 if(str.charAt(i)==a) {
				 count++;
				 System.out.println(str.charAt(i)+ "=" + count);
			 }
		}
	}

}
