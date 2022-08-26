package com.sreenutech.model;

public class CustomerDetails {
    private String id;
    private String name;
    private String desc;
    private String discount;
    private String expdate;
    private String offerName;
    private String dob;
    private String email;

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", discount='" + discount + '\'' +
                ", expdate='" + expdate + '\'' +
                ", offerName='" + offerName + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", mobNo='" + mobNo + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    private String address;
    private String mobNo;

}
