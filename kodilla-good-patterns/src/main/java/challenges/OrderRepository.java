package challenges;

import java.util.Map;

public interface OrderRepository {
    Map<User, OrderRequest> registerOrder(OrderRequest orderRequest);
}