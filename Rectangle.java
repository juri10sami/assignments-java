
public class Rectangle {
private double width, height;

public Rectangle(double width, double height) {
	this.width = width;
	this.height = height;
}
public double area() {
	double area =  width*height;
	return area;
	
}
public double perimeter() {
	return 2*width+2*height;
}

}
