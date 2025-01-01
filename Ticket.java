
public abstract class Ticket {
private int serialNumber;

public Ticket() {
	serialNumber = getNextSerialNumber();
}
public int getSerial() {
	return serialNumber;
}
public abstract double getPrice();

public String toString() {
	return "Number: " + serialNumber + "\nPrice: " + getPrice();
}
private static int getNextSerialNumber() {
	return (int)(Math.random()*900)+100;
}
}
