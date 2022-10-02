package challenges;

public class OrderApplication {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationServiceProcessor(), new OrderServiceProcessor(), new OrderRepositoryProcessor());
        productOrderService.process(orderRequest);
    }
}