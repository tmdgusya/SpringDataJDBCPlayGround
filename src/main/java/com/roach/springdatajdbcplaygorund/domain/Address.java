package com.roach.springdatajdbcplaygorund.domain;

public class Address {

    private final String province;

    private final String gungu;

    private final String detail_address;

    public Address(String province, String gungu, String detail_address) {
        this.province = province;
        this.gungu = gungu;
        this.detail_address = detail_address;
    }

    public String getProvince() {
        return province;
    }

    public String getGungu() {
        return gungu;
    }

    public String getDetail_address() {
        return detail_address;
    }

}
