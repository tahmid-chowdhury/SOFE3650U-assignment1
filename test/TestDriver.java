public class TestDriver {
    public static void main(String[] args) {
        GroceryProductFactory appleFactory = new AppleFactory();
        GroceryProductFactory bananaFactory = new BananaFactory();

        GroceryProduct apple = appleFactory.createProduct("Green Apple");
        GroceryProduct banana = bananaFactory.createProduct("Banana");

        System.out.println("The price of apples is " + apple.getPrice());
        System.out.println("The price of bananas is " + banana.getPrice());

        // Different implementation
        Apple redApple = new Apple("Red Apple", 0.99);
        System.out.println("Name: " + redApple.getName());
        System.out.println("Price: " + redApple.getPrice());

        Banana banana = new Banana("Banana", 0.59);
        System.out.println("Name: " + banana.getName());
        System.out.println("Price: " + banana.getPrice());
    }
}
