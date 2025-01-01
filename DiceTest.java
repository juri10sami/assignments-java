import java.util.Scanner;

public class DiceTest {
	
public static void main(String[] args) {
	
	Dice d[] = new Dice [200];
	Dice d1 = new Dice(0);
	
	for(int i = 0, y=0;i<d.length;i++) {
	y = d1.roll();
	d[i] = new Dice(y);
	}
	
	d1.luckyNine(d);
	d1.twins(d);
	d1.snakeEyes(d);
	d1.evenOnEven(d);
	d1.threePeat(d);
	d1.diceCount(d);
	
}

}
