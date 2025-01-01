import java.util.ArrayList;

public class MyContancts {
    public static int findContact(String contact, ArrayList<String> names, ArrayList<Integer> contactInfo) {
        int x = -1;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).indexOf(contact) >= 0) {
                x = i;
                i=names.size();
            }
        }
        System.out.println("name: " + names.get(x)+ " contact number: "+ contactInfo.get(x));
        return x;
    }
    
    public static void delete(String contact, ArrayList<String> names, ArrayList<Integer> contactInfo) {
        int indexToRemove = -1;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(contact)) {
                indexToRemove = i;
                i= names.size();
            }
        }

        if (indexToRemove != -1) {
            names.remove(indexToRemove);
            contactInfo.remove(indexToRemove);
        }
    }
    
    public static void display(ArrayList<String> names, ArrayList<Integer> contactInfo) {
    	for(int i =0; i<names.size(); i++) {
    System.out.println("name: " + names.get(i)+ " contact number: "+ contactInfo.get(i));
    	}
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> contactInfo = new ArrayList<>();

        names.add("Al Beback");
        names.add("Joe King");
        names.add("Cole Dasice");

        contactInfo.add(55510000);
        contactInfo.add(55520000);
        contactInfo.add(55530000);

      

        MyContancts.findContact("Joe King", names, contactInfo);
        MyContancts.delete("Joe King", names, contactInfo);
        
        System.out.println(names);
        System.out.println(contactInfo);
        MyContancts.display(names, contactInfo);
    }
}