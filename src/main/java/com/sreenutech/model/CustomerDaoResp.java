package com.sreenutech.model;

public class CustomerDaoResp {
    private String name;
    private String dob;
    private String email;
    private String address;
    private String mobNo;

    @Override
    public String toString() {
        return "CustomerDaoResp{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", mobNo='" + mobNo + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
