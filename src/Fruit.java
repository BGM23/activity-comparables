import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Fruit implements Comparable<Fruit> {
    private String fruitName;
    private String fruitDesc;
    private int fruitQty;

    // Constructor
    public Fruit(String fruitName, String fruitDesc, int fruitQty) {
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.fruitQty = fruitQty;
    }

    // Getters and setters
    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public int getFruitQty() {
        return fruitQty;
    }

    public void setFruitQty(int fruitQty) {
        this.fruitQty = fruitQty;
    }

    // Implementing compareTo method
    @Override
    public int compareTo(Fruit other) {
        // First compare by fruitName
        int nameComparison = this.fruitName.compareTo(other.getFruitName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        // If fruitName is the same, compare by fruitQty
        return Integer.compare(this.fruitQty, other.getFruitQty());
    }

    // Implementing toString method
    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitDesc='" + fruitDesc + '\'' +
                ", fruitQty=" + fruitQty +
                '}';
    }
}


