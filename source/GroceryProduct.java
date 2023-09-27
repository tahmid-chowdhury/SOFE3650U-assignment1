import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

abstract class GroceryProduct {
    public String productName;
    public double productPrice;

    public GroceryProduct(String productName) {
        this.productName = productName;
    }

    public void setPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getPrice() {
        return productPrice;
    }

    public abstract void initializePriceFromDatabase(String fileName);
}
