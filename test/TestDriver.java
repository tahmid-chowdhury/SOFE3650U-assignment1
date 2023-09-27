public class TestDriver {
    public static void main(String[] args) {
        GroceryProductFactory appleFactory = new AppleFactory();
        GroceryProductFactory bananaFactory = new BananaFactory();

        GroceryProduct apple = appleFactory.createProduct("Green Apple");
        GroceryProduct banana = bananaFactory.createProduct("Banana");

        System.out.println("The price of apples is " + apple.getPrice());
        System.out.println("The price of bananas is " + banana.getPrice());
    }
}
