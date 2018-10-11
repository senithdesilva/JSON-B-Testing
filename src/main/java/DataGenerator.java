import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static OrderPropertyDescriptor getData() {
        AddressPropertyDescriptor address = new AddressPropertyDescriptor();
        address.setCity("Phillip");
        address.setCountry("Australia");
        address.setStreet("Chandler St");
        address.setZipcode(2506);

        List<ProductPropertyDescriptor> products = new ArrayList<>();
        products.add(new ProductPropertyDescriptor(1, "Phone", "Sony", "Amazon Shipping", 899.99));
        products.add(new ProductPropertyDescriptor(2, "Laptop", "Dell", "Dell Shipping", 2486.98));
        products.add(new ProductPropertyDescriptor(3, "Echo dot", "Amazon", "Amazon Shipping", 200.00));
        products.add(null);

        OrderDetailsPropertyDescriptor orderDetails = new OrderDetailsPropertyDescriptor(products, address, 3500.00);

        CustomerPropertyDescriptor customer = new CustomerPropertyDescriptor(456, "Mr. Peter", "peter@hotmail.com", true);

        OrderPropertyDescriptor order = new OrderPropertyDescriptor(orderDetails, 256, LocalDate.parse("2018-10-11"), LocalDate.parse("2018-10-11"), customer);

        return order;
    }
}
