class Rectangle{
    private int length;
    private int width;
    Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public int area(){
        return this.length*this.width;
    }
    public int perimeter(){
        return 2*(this.length+this.width);
    }
    @Override
    public String toString(){
        return "Length: "+this.length+" Width: "+this.width;
    }
}
public class A1_Q2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        System.out.println("Dimensions of rectangle");
        System.out.println(r1);
        System.out.println("Area of rectangle: "+r1.area());
        System.out.println("Perimeter of rectangle: "+r1.perimeter());
    }    
}
