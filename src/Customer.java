public class Customer {
    private String name ;
    private long phoneNumber ;
    Customer(String name, long phone){
        this.name=name;
        this.phoneNumber=phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
