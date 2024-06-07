import java.util.Scanner;

public class celtofah {
    //Celsius to Fahrenheit
    
    static double fahr(double ce) {
           double a= 1.8 * ce + 32;
            return a;
        }
    
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
    }
}