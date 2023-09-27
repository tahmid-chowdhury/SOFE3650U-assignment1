public interface GroceryProductFactory {
    public GroceryProduct createProduct(String name);
}

class AppleFactory implements GroceryProductFactory {
    public GroceryProduct createProduct() {
        Apple apple = new Apple();
        double priceFromFile = 0;   // Fix this
        apple.setPrice(priceFromFile);
        return apple;
    }
}

class OrangeFactory implements GroceryProductFactory {
    public GroceryProduct createProduct() {
        Orange orange = new Orange();
        double priceFromFile = 0;   // Fix this
        orange.setPrice(priceFromFile);
        return orange;
    }
}

class BananaFactory implements GroceryProductFactory {
    public GroceryProduct createProduct() {
        Banana banana = new Banana();
        double priceFromFile = 0;   // Fix this
        banana.setPrice(priceFromFile);
        return banana;
    }
}