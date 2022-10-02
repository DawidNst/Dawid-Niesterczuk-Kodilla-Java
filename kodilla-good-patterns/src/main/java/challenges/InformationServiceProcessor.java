package challenges;

public class InformationServiceProcessor implements InformationService {
    @Override
    public void sendConfirmation(OrderRequest orderRequest) {
        System.out.println("...\nConfirmation of sending: " + orderRequest.getUser().getUserEmail() + "\n" +
                "\"Customer " + orderRequest.getUser().getUserName() + ",the order is being processed: " + orderRequest.getProduct() + " , quantity: " + orderRequest.getQuantity() + ".\n" +
                "the order has been forwarded for shipment.\"\n...");
    }
}
