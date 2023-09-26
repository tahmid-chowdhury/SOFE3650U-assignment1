import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

abstract class GroceryProduct {
    private String productName;
    private double productPrice;

    public GroceryProduct(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void setPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getPrice() {
        return productPrice;
    }

    public void priceFromFile(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            double newPrice = scanner.nextDouble();
            scanner.close();
            setPrice(newPrice);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}

class Apple extends GroceryProduct {
    public Apple(String productName, double productPrice) {
        super(productName, productPrice);
    }
}

class Orange extends GroceryProduct {
    public Orange(String productName, double productPrice) {
        super(productName, productPrice);
    }
}

class Banana extends GroceryProduct {
    public Banana(String productName, double productPrice) {
        super(productName, productPrice);
    }
}