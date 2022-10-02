package challenges.Food;

public class OrderFoodRetriever {
    public OrderFoodRequest retrieve(){
        FoodProduct foodProduct1 = new FoodProduct("bread full of grain", 9, new GlutenFree());

        int toOrderQuantity = 6;


        return new OrderFoodRequest(foodProduct1, toOrderQuantity);
    }
}