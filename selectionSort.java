
public class selectionSort {
public static void main(String [] args) {
	int [] meow = new int [100000];
	for(int i =0; i<meow.length; i++) {
		meow[i]= (int)(Math.random()*10000)+1;
	}
	StopWatch timer = new StopWatch();
	timer.start();
		linSearch(meow, 9898);
	timer.stop();
	System.out.println("elapsed time: "+ timer.getElapsedTime()+ " millisedonds");
}
public static void selectionSort( int[] a) {
	int outer, inner, min;
	for(outer =0; outer<a.length-1; outer++) {
		min = outer;
		for(inner =outer +1; inner<a.length; inner++) {
			if(a[inner]<a[min]) {
				min = inner;
			}
		}
		int temp = a[outer];
		a[outer]=a[min];
		a[min]=temp;
	}
}

public static void selectionSort(String[] array) {
	for(int j =0; j<array.length-1; j++) {
		int min =j;
		for(int k =j+1; k<array.length; k++) {
			if(array[k].compareTo(array[min])<0) {
				min =k;
			}
			String temp = array[j];
			array[j]=array[min];
			array[min]= temp;
		}
	}
}
public static int linSearch(int [] array, int target) {
	
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return i;
        }
    }
    return -1;
}
public static void selectionSort1(String[] array) {
	for(int j=0; j<array.length-1; j++) {
		int min =j;
		for(int k=j+1; k<array.length; k++) {
			if(array[k].compareTo(array[min]) <0) min =k;
			
			String temp = array[j];
			array[j]= array[min];
			array[min] = temp;
		}
	}
}
}
