class Car{
    private int make;
    private String model;
    Car(int make , String model){
        this.make = make;
        this.model = model;
    }
    public void setMake(int make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    @Override
    public String toString(){
        return "Make: "+this.make+" Model: "+this.model;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Car t1 = new Car(10, "abc");
        Car t2 = new Car(0 , null);
        System.out.println("Initial value of Car1: ");
        System.out.println(t1);
        System.out.println("Initial value of Car2: ");
        System.out.println(t2);
        t2.setMake(20);
        t2.setModel("def");
        System.out.println("Updated value of Car2: ");
        System.out.println(t2);
    }
}
