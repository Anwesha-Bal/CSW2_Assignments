import java.util.ArrayList;
class Image{
    private int imageWidth;
    private int imageHeight;
    private String colorCode;
    Image(){
        this.imageWidth = 0;
        this.imageHeight = 0;
    }
    Image(int imgWidth , int imgHeight , String colorCode){
        this.imageWidth = imgWidth;
        this.imageHeight = imgHeight;
        this.colorCode = colorCode;
    }
    public void setWidth(int imgWidth){
        this.imageWidth = imgWidth;
    }
    public int getWidth(){
        return this.imageWidth;
    }
    public void setHeight(int imgHeight){
        this.imageHeight = imgHeight;
    }
    public int getHeight(){
        return this.imageHeight;
    }
    public void setColor(String color){
        this.colorCode = color;
    }
    public String getColor(){
        return this.colorCode;
    }
    @Override
    public String toString(){
        return "Image Height : "+this.imageHeight+" Image Width : "+this.imageWidth + " Colour : "+this.colorCode;
    }
}
class ImageLibrary{
    ArrayList<Image> arr1 = new ArrayList<>();
     public void add(Image img){
        arr1.add(img);
     }
     public Image search(Image img){
        for(Image img1 : arr1){
            if(img1.getColor()==img.getColor()){
                return img1;
            }
        }
        return null;
     }
     public void display(){
        if(arr1.isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        for(Image img : arr1){
            System.out.println(img.toString());
        }
     }
}
public class A1_Q4_Q5 {
    public static void main(String[] args) {
        Image img = new Image();
        Image img1 = new Image(10, 20,"yellow");
        ImageLibrary arr = new ImageLibrary();
        img.setWidth(30);
        img.setHeight(40);
        img.setColor("pink");
        System.out.println(img);
        System.out.println(img1);
        arr.add(img);
        arr.add(img1);
        arr.add(new Image(2,4,"green"));
        arr.add(new Image(6,8,"White"));
        System.out.println("List of images: ");
        arr.display();
        System.out.println("Find image with colour pink");
        System.out.println(arr.search(img));
    }
}
