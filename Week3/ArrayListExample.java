import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Display ArrayList
        System.out.println("Fruits: " + fruits);

        // Access an element
        System.out.println("First fruit: " + fruits.get(0));

        // Change an element
        fruits.set(1, "Grapes");

        // Remove an element
        fruits.remove("Mango");

        // Check size
        System.out.println("Size: " + fruits.size());

        // Check if an element exists
        System.out.println("Contains Apple: " + fruits.contains("Apple"));

        // Display final ArrayList
        System.out.println("Final ArrayList: " + fruits);
    }
}