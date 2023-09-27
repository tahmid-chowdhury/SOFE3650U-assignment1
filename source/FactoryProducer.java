public class FactoryProducer {
    public static AbstractFactory getFactory(boolean fruit) {
        while (fruit) {
            return new Products();
        }
        return null;
    }
}
