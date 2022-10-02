package challenges.Food;

public class Application {
    public static void main(String[] args) {

        OrderFoodRetriever orderFoodRetriever = new OrderFoodRetriever();
        OrderFoodRequest orderFoodRequest = orderFoodRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new GlutenFree(), new DeliveryService() {
            @Override
            public void createDelivery(FoodProduct foodProduct) {

            }
        });
        orderProcessor.process(orderFoodRequest);


    }
}