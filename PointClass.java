import java.util.Scanner;
public class PointClass {
private int x=0;
private int y=7;

public PointClass ( int newX,int newY){
	x = newX;
	y= newY;
}
	
public PointClass() {
		
	}
public void setX(int x) {
	this.x=x;
}
public void setY(int y) {
	this.y=y;
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}
public String toString() {
	return "("+x+", " + y+ ")";
	}
}


