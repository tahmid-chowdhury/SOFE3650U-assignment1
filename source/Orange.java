import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Orange extends GroceryProduct {
    public Orange(String productName) {
        super(productName);
    }

    @Override
    public void initializePriceFromDatabase(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].trim().equals(this.productName)) {
                    double newPrice = Double.parseDouble(parts[1].trim());
                    setPrice(newPrice);
                    break; // Stop reading after finding the price
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading database file: " + e.getMessage());
        }
    }
}
