package challenges;

public class Product {
    private final String productName;
    private final String productId;
    private final double productUnitPrice;

    public Product(final String productName, final String productId, final double productUnitPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productUnitPrice = productUnitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductNumber() {
        return productId;
    }

    public double getProductUnitPrice() {
        return productUnitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public String toString() {
        return "[" +
                productName +
                ", Id=" + productId +
                ", unit price=" + productUnitPrice +
                " PLN]";
    }
}