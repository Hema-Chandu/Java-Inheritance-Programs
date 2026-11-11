
class Food {
    String foodName;
    double price;

    Food(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }

    void displayFood() {
        System.out.println("Food Name: " + foodName);
        System.out.println("Price: " + price);
    }
}

class Pizza extends Food {
    String size;

    Pizza(String foodName, double price, String size) {
        super(foodName, price);
        this.size = size;
    }

    void calculatePrice() {
        double total = price;

        if (size.equalsIgnoreCase("Large")) {
            total += 100;
        } else if (size.equalsIgnoreCase("Medium")) {
            total += 50;
        }

        System.out.println("Total Price: " + total);
    }

    void displayPizza() {
        displayFood();
        System.out.println("Size: " + size);
        calculatePrice();
    }
}

public class ex1 {
    public static void main(String[] args) {
        Pizza p = new Pizza("Margherita", 200, "Large");
        p.displayPizza();
    }
}
