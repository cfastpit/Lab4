
import java.util.Scanner;


public class mainCircle {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a radius for the the circle ");
       
        Circle circle1=new Circle(keyboard.nextDouble());
            
        System.out.println("the area is "+circle1.getArea());
        System.out.println("the diamer is "+circle1.getDimeter());
        System.out.println("the circumference is "+circle1.getCircumference());
            
        
    }
  
}
