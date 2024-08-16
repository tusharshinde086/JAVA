

public class Impcast2 {
	 public static void main(String[] args) {
         double num = 3.14;
         float result = num;  // Error: incompatible types: possible lossy conversion from double to float
         System.out.println("Float value: " + result);
     }

}
