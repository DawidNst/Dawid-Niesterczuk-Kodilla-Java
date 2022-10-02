package challenges;

public interface OrderService {
    boolean processOrder(User user, Product product, int quantity);
}
