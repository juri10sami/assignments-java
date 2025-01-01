import java.util.Scanner;
public class PointTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PointClass p1 = new PointClass();
		
		p1.setX(5);
		p1.setY(7);
		System.out.println(p1.getX() + "  "+ p1.getY());
		
		PointClass p2 = new PointClass();
		p2.setX(6);
		p2.setY(8);
		System.out.println(p2.getX()+" "+p2.getY());
}
}