public class CustomerPropertyDescriptor {
    private int customerID;
    private String customerName;
    private String email;
    private boolean isPrimeUser;

    public CustomerPropertyDescriptor(int customerID, String customerName, String email, boolean isPrimeUser) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
        this.isPrimeUser = isPrimeUser;
    }

    public CustomerPropertyDescriptor() {}

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
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
