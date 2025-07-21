package Strings;

public class StringBufffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();

		 // 1. append(String) - Add text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);  // Hello World

        // 2. capacity() - Get current capacity
        System.out.println("Capacity: " + sb.capacity());

        // 3. ensureCapacity(int) - Ensure minimum capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 4. reverse() - Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);  // dlroW olleH

        // Reverse back to normal for further operations
        sb.reverse();

        // 5. length() - Get the length of the string
        System.out.println("Length: " + sb.length());

        // 6. trimToSize() - Trim to actual size
        sb.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb.capacity());

        // 7. charAt(int) - Get character at index 1
        System.out.println("Character at index 1: " + sb.charAt(1));  // 'e'

        // 8. delete(int, int) - Delete characters from index 5 to 6
        sb.delete(2, 4);  // removes the space between Hello and World
        System.out.println("After delete(2,5): " + sb);  // HelloWorld

        // 9. deleteCharAt(int) - Delete character at index 5
        sb.deleteCharAt(3);
        System.out.println("After deleteCharAt(5): " + sb);  // Helloorld

        // 10. replace(int, int, String) - Replace part of string
        sb.replace(2, 4, " Java");
        System.out.println("After replace(5,9,\" Java\"): " + sb);  // Hello Java

        // 11. insert(int, String) - Insert string at position
        sb.insert(5, ",");
        System.out.println("After insert(5,\",\"): " + sb);  // Hello, Java
	}

}
