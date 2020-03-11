
public class Maincar {

    public static void main(String[] args) {
        Car mycar = new Car(ford,2000, 1);
        System.out.println("car is accelerating  for the first time at "+mycar.getAccelerate());
        System.out.println("car is accelerating for the second time at "+mycar.getAccelerate());
        System.out.println("car is accelerating for the third time at "+mycar.getAccelerate());
        System.out.println("car is accelerating for the fourth time at "+mycar.getAccelerate());  
        System.out.println("car is accelerating for the fifth time at "+mycar.getAccelerate());
        System.out.println("car is breaking for the first time at "+mycar.getCarBreak());
        System.out.println("car is breaking for the second time at "+mycar.getCarBreak());
        System.out.println("car is breaking for the third time at "+mycar.getCarBreak());
        System.out.println("car is breaking for the fourth time at "+mycar.getCarBreak());
        System.out.println("car is breaking for the fifth time at "+mycar.getCarBreak());
    }
}
