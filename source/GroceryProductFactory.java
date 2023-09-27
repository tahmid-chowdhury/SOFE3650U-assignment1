public interface GroceryProductFactory {
  public GroceryProduct createProduct(String productName);
}

class AppleFactory implements GroceryProductFactory {
  public GroceryProduct createProduct(String productName) {
    Apple apple = new Apple(productName);
    return apple;
  }
}

class OrangeFactory implements GroceryProductFactory {
  public GroceryProduct createProduct(String productName) {
    Orange orange = new Orange(productName);
    return orange;
  }
}

class BananaFactory implements GroceryProductFactory {
  public GroceryProduct createProduct(String productName) {
    Banana banana = new Banana(productName);
    return banana;
  }
}
