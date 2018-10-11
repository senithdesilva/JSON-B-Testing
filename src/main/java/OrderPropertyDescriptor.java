import java.time.LocalDate;
import java.util.Date;

public class OrderPropertyDescriptor {
    private OrderDetailsPropertyDescriptor orderDetails;
    private int orderID;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private CustomerPropertyDescriptor customer;

    public OrderPropertyDescriptor(OrderDetailsPropertyDescriptor orderDetails, int orderID, LocalDate orderDate, LocalDate deliveryDate, CustomerPropertyDescriptor customer) {
        this.orderDetails = orderDetails;
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.customer = customer;
    }

    public OrderPropertyDescriptor() { }

    public OrderDetailsPropertyDescriptor getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetailsPropertyDescriptor orderDetails) {
        this.orderDetails = orderDetails;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public CustomerPropertyDescriptor getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerPropertyDescriptor customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "OrderPropertyDescriptor{" +
                "orderDetails=" + orderDetails +
                ", orderID=" + orderID +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", customer=" + customer +
                '}';
    }
}
