package challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan Kowalski", "JanKowalski@gmail.com", 600900500, "15-900 Kraków, Błotna 12");
        Product product = new Product("Phone Samsung Galaxy 12 plus, size:6,9", "1", 5689.0);
        int quantity = 1;

        return new OrderRequest(user, product, quantity);
    }
}