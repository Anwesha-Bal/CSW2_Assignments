package Image_Gallery;
public class image {
	double imgWidth;
	double imgHeight;
	String colourCode;
	image(){
		this.imgWidth = 0;
		this.imgHeight = 0;
		this.colourCode = null;
	}
	image(double width , double height , String color){
		this.imgWidth = width ; 
		this.imgHeight = height;
		this.colourCode = color;
	}
	public void setWidth(double w) {
		this.imgWidth = w;
	}
	public void setHeight(double h) {
		this.imgHeight = h;
	}
	public void setColorCode(String c) {
		this.colourCode = c;
	}
	public double getwidth() {
		return imgWidth;
	}
	public double getHeight() {
		return imgHeight;
	}
	public String getColour() {
		return colourCode;
	}
	@Override
	public String toString() {
		return "Height: "+imgHeight + " Width: "+imgHeight+" Colour: "+colourCode;
	}
	
}
