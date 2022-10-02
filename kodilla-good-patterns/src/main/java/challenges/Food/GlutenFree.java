package challenges.Food;

public class GlutenFree implements FoodProducer {

    private String producerName;
    private String producerMail;
    private int producerStock;

    public GlutenFree() {
        this.producerName =  "GlutenFree";
        this.producerMail = "glutenfreeshop@ggmail.com";
        this.producerStock = 99;
    }

    @Override
    public boolean process(FoodProduct foodProduct, int toOrderQuantity) {
        if (toOrderQuantity < getProducerStock()) {
            System.out.println("order " + toOrderQuantity + " kg " + foodProduct.getProductName() + " in "+getProducerName());
            System.out.println("Sending mail "+ getProducerMail());
            return true;
        } else {
            System.out.println(getProducerName() + " only " + getProducerStock() +" kg "+foodProduct.getProductName());
            return false;
        }
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProducerMail() {
        return producerMail;
    }

    public int getProducerStock() {
        return producerStock;
    }
}