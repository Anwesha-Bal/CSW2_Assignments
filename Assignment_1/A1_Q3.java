class Point{
    int x;
    int y;
    Point(int x , int  y){
        this.x = x;
        this.y = y;
    }
    //COPY CONSTRUCTOR
    Point(Point obj){
        this.x = obj.x;
        this.y = obj.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return this.y;
    }
    @Override
    public String toString(){
        return "X: "+this.x+" Y: "+this.y;
    }
}
public class A1_Q3 {
    public static void main(String[] args) {
        Point p1 = new Point(2,4);
        System.out.println("The points are: ");
        System.out.println(p1);
        System.out.println("Copy object: ");
        Point pCopy = new Point(p1);
        System.out.println("The copied points are: ");
        System.out.println(pCopy);
        System.out.println("Updation of original points: ");
        p1.setX(10);
        p1.setY(20);
        System.out.println(p1);
        System.out.println("Updation of copied points: ");
        pCopy.setX(40);
        pCopy.setY(60);
        System.out.println(pCopy);
    }
}
