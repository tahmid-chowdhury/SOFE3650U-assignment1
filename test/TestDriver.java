public class TestDriver {
    public static void main(String[] args) {
        GroceryProductFactory appleFactory = new AppleFactory();
        GroceryProductFactory bananaFactory = new BananaFactory();

        GroceryProduct apple = appleFactory.createProduct("Apple");
        GroceryProduct banana = bananaFactory.createProduct("Banana");

        // Initialize prices from the database
        apple.initializePriceFromDatabase("database.txt");
        banana.initializePriceFromDatabase("database.txt");

        System.out.println("The price of an apple is " + "$" + apple.getPrice());
        System.out.println("The price of a banana is " + "$" + banana.getPrice());
    }
}
