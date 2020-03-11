
public class Circle {

    private double radius;
    private final double PIE = 3.14159;

    public Circle(double radius){
        this.radius=radius;
    }
    public Circle() {
        this.radius = 0;
    }
    public double getArea(){
        double area=PIE*radius*radius;
        return area;
    }
    public double getDimeter(){
        double dimeter=radius*2;
        return dimeter;
    }
    public double getCircumference(){
        double circumference=2*PIE*radius;
        return circumference;
    }
//get and set

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPie() {
        return PIE;
    }

 
}
