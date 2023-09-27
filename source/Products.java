public class Products extends AbstractFactory {

    //use getProducts method to get type of product
    public GroceryProductFactory getProducts(String productType){

        //return null if no product type mentioned
        if(productType == null){
            return null;
        }
        //returns Apple when called, case ignored
        if(productType.equalsIgnoreCase("APPLE")){
            return new Apple();

            //returns Banana when called, case ignored
        } else if(productType.equalsIgnoreCase("BANANA")){
            return new Banana();

        }
        return null;
    }
}