
public class Car {

    private int yearModel;
    private String make;
    private int speed;

    public Car(String make,int year,int speed) {
        this.make=make;
        this.yearModel=year;
        this.speed=speed;
    }
    public Car(){
        this.speed=0;
    }

   public int  getAccelerate(){
    int accelerate=0;
            accelerate=this.speed+5;
    this.speed=accelerate;
       return speed;
}
    public int getCarBreak(){
        int carBreak =this.speed-5;
        this.speed=carBreak;
        return speed;
    }
    
    
    // this is get and set
    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
