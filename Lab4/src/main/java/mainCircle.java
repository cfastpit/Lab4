
import java.util.Scanner;


public class mainCircle {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       double radius=0.0;
        System.out.println("Enter a radius for the the circle ");
        radius = keyboard.nextDouble();
        Circle circle1=new Circle(radius);
            
        System.out.println("the area is ");
            
        
    }
  
}
