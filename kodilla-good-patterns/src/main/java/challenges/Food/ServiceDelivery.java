package challenges.Food;

public class ServiceDelivery implements DeliveryService {
    @Override
    public void createDelivery(FoodProduct foodProduct) {
        System.out.println("Sending transport for "+foodProduct.getProductName());
    }
}