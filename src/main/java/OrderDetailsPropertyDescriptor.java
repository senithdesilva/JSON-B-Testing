import java.util.List;
import java.util.function.DoubleConsumer;

public class OrderDetailsPropertyDescriptor {
    private List<ProductPropertyDescriptor> products;
    private AddressPropertyDescriptor shippingAddress;
    private Double totalAmount;

    public OrderDetailsPropertyDescriptor(List<ProductPropertyDescriptor> products, AddressPropertyDescriptor shippingAddress, Double totalAmount) {
        this.products = products;
        this.shippingAddress = shippingAddress;
        this.totalAmount = totalAmount;
    }

    public OrderDetailsPropertyDescriptor() {}

    public List<ProductPropertyDescriptor> getProducts() {
        return products;
    }

    public void setProducts(List<ProductPropertyDescriptor> products) {
        this.products = products;
    }

    public AddressPropertyDescriptor getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(AddressPropertyDescriptor shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "OrderDetailsPropertyDescriptor{" +
                "products=" + products +
                ", shippingAddress=" + shippingAddress +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
