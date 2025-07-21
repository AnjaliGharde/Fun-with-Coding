package Strings;

public class Toy_finalizeMethod {

	 protected void finalize() {
	        System.out.println("Toy is being destroyed.");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy_finalizeMethod t1 = new Toy_finalizeMethod();
        t1 = null;

        System.gc();  
        System.out.println("Main ends.");
	}

}
