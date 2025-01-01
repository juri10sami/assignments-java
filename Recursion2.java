
public class Recursion2 {
    public static void main(String[] args) {
        printNumbers(1, 10, false);
        System.out.println();
        System.out.println(reverseString("wizard"));
    }

    public static void printNumbers(int start, int end, boolean printEven) {
        if (start > end) {
            return;
        }

        if (printEven) {
            if (start % 2 == 0) {
                System.out.print("Even Number: " + start + " ");
            }
        } else {
            if (start % 2 != 0) {
                System.out.print("Odd Number: " + start + " ");
            }
        }

        printNumbers(start + 1, end, printEven);

        if (!printEven && start % 2 == 0) {
            System.out.print("Even Number: " + start + " ");
        }
    }
    public static String reverseString(String str) {
        if (str.length() == 0) { 
            return "";
        }

        return reverseString(str.substring(1)) + str.charAt(0); 
    }
}