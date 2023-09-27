public class TestDriver {
    public static void main(String[] args){

        //accessing Products through AbstractFactory class
    AbstractFactory Products = FactoryProducer.getFactory(true);

    //get an object of Apple
    GroceryProductFactory Product1 = Products.getProducts("Apple");
        //call setPrice method of Apple
    Product1.setPrice();

        //get an object of Banana
        GroceryProductFactory Product2 = Products.getProducts("Banana");
        //call setPrice method of Banana
    Product2.setPrice();

    }
}
