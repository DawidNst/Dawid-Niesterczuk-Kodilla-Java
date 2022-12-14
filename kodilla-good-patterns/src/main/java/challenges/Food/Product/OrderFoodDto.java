package challenges.Food.Product;


import challenges.Food.FoodProduct;

public class OrderFoodDto {

    private FoodProduct foodProduct;
    private int toOrderQuantity;
    private boolean isOrdered;

    public OrderFoodDto(final FoodProduct foodProduct, final int toOrderQuantity, final boolean isOrdered) {
        this.foodProduct = foodProduct;
        this.toOrderQuantity = toOrderQuantity;
        this.isOrdered = isOrdered;
    }

    public FoodProduct getFoodProduct() {
        return foodProduct;
    }

    public int getToOrderQuantity() {
        return toOrderQuantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}