public class ProductPropertyDescriptor {
    private int id;
    private String name;
    private String manufacturer;
    private String shippingCompany;
    private Double price;

    public ProductPropertyDescriptor(int id, String name, String manufacturer, String shippingCompany, Double price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.shippingCompany = shippingCompany;
        this.price = price;
    }

    public ProductPropertyDescriptor() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductPropertyDescriptor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", shippingCompany='" + shippingCompany + '\'' +
                ", price=" + price +
                '}';
    }
}
