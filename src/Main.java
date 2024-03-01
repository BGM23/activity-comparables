import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list of fruits
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", "Red and juicy", 10));
        fruits.add(new Fruit("Orange", "Orange and tangy", 15));
        fruits.add(new Fruit("Banana", "Yellow and sweet", 20));
        fruits.add(new Fruit("Apple", "Green and sour", 8)); // Testing with same fruitName

        // Sorting the list
        Collections.sort(fruits);

        // Outputting the sorted list using streams
        fruits.forEach(System.out::println);
    }
}