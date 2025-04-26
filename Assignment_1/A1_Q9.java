interface Vehicle{
    void accelerate();
    void brake();
}
class Car implements Vehicle{
    @Override
    public void accelerate(){
        System.out.println("Car is accelerating ");
    }
    public void accelerate(int speed){
        System.out.println("Car is accelerating at a speed of "+speed);
    }
    @Override
    public void brake(){
        System.out.println("Car is applying brake");
    }
    public void accelerate(int speed,int duration){
        System.out.println("Car is accelerating at a speed of "+speed+" in duration: "+duration);
    }
}
class Bicycle implements Vehicle{
    @Override
    public void accelerate(){
        System.out.println("Bicycle is accelerating ");
    }
    public void accelerate(int speed){
        System.out.println("Bicycle is accelerating at a speed of "+speed);
    }
    @Override
    public void brake(){
        System.out.println("Bicycle is applying brake");
    }
    public void accelerate(int speed,int duration){
        System.out.println("Bicycle is accelerating at a speed of "+speed+" in duration: "+duration);
    }
}
public class A1_Q9 {
    public static void main(String[] args) {
    Vehicle myCar = new Car();
    Car specifiCar = new Car();
    Vehicle myBicycle = new Bicycle();
    Bicycle specificCycle = new Bicycle();
    myCar.accelerate();
    myCar.brake();
    specifiCar.accelerate(80);
    specifiCar.accelerate(80 , 10);
    myBicycle.accelerate();
    myBicycle.brake();
    specificCycle.accelerate(20);
    specificCycle.accelerate(20 , 10);

    }
    
}
