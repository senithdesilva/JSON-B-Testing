public class CustomerPropertyDescriptor {
    private String customerID;
    private String customerName;
    private String email;
    private boolean isPrimeUser;

    public CustomerPropertyDescriptor(String customerID, String customerName, String email, boolean isPrimeUser) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
        this.isPrimeUser = isPrimeUser;
    }

    public CustomerPropertyDescriptor() {}

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrimeUser() {
        return isPrimeUser;
    }

    public void setPrimeUser(boolean primeUser) {
        isPrimeUser = primeUser;
    }

    @Override
    public String toString() {
        return "CustomerPropertyDescriptor{" +
                "customerID='" + customerID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", isPrimeUser=" + isPrimeUser +
                '}';
    }
}
