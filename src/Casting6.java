
package chapter1;

public class Casting6 {
	public static void main(String[] args) {
        int num = 130;
        byte b = num;  // Error: incompatible types: possible lossy conversion from int to byte
        System.out.println("Byte value: " + b);
    }

}
