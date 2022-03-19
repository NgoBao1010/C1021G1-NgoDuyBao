package model.customer;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private String birthday;
    private boolean gender;
    private String idCardCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String addressCustomer;
    private int idCustomerType;
    private String nameCustomerType;

    public Customer(int idCustomer, String nameCustomer, String birthday, boolean gender, int idCustomerType, String nameCustomerType) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCustomerType = idCustomerType;
        this.nameCustomerType = nameCustomerType;
    }

    public Customer( String nameCustomer, String birthday, boolean gender, int idCustomerType) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCustomerType = idCustomerType;
    }

    public Customer(String nameCustomer, String birthday, boolean gender, String idCardCustomer, String phoneCustomer, String emailCustomer, String addressCustomer, int idCustomerType) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.idCustomerType = idCustomerType;
    }



    public Customer(int idCustomer, String nameCustomer, String birthday, boolean gender, String idCardCustomer, String phoneCustomer, String emailCustomer, String addressCustomer, int idCustomerType) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.idCustomerType = idCustomerType;
    }

    public Customer(int idCustomer, String nameCustomer, String birthday, boolean gender, String idCardCustomer, String phoneCustomer, String emailCustomer, String addressCustomer, int idCustomerType, String nameCustomerType) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.idCustomerType = idCustomerType;
        this.nameCustomerType = nameCustomerType;
    }



    public String getIdCardCustomer() {
        return idCardCustomer;
    }

    public void setIdCardCustomer(String idCardCustomer) {
        this.idCardCustomer = idCardCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(int idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getNameCustomerType() {
        return nameCustomerType;
    }

    public void setNameCustomerType(String nameCustomerType) {
        this.nameCustomerType = nameCustomerType;
    }
}
