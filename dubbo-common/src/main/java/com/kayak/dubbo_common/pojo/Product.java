package com.kayak.dubbo_common.pojo;

import java.io.Serializable;

/**
 * Created by JayJ on 2019/7/23.
 **/
public class Product implements Serializable{
    private String prodCode;
    private String prodName;
    private Float price;

    public Product(String prodCode) {
    }


    @Override
    public String toString() {
        return "Product{" +
                "prodCode='" + prodCode + '\'' +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Product(String prodCode, String prodName, Float price) {

        this.prodCode = prodCode;
        this.prodName = prodName;
        this.price = price;
    }
}
