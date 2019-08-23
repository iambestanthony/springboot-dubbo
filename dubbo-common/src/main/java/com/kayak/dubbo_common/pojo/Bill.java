package com.kayak.dubbo_common.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by JayJ on 2019/8/15.
 **/
public class Bill implements Serializable{
    /*
    * `id` int(7) NOT NULL AUTO_INCREMENT,
  `user_id` int(7) DEFAULT NULL,
  `bill_name` varchar(32) DEFAULT NULL COMMENT '账单名称',
  `trans_serno` varchar(32) NOT NULL,
  `trans_date` char(8) NOT NULL,
  `trans_time` char(8) NOT NULL,
  `pay_type` char(32) DEFAULT NULL,
  `pay_amt` decimal(16,2) DEFAULT NULL,
    * */
    private int id;
    private int userId;
    private String billName;
    private String transSerno;
    private String transDate;
    private String transTime;
    private String payType;
    private BigDecimal payAmt;

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", userId=" + userId +
                ", billName='" + billName + '\'' +
                ", transSerno='" + transSerno + '\'' +
                ", transDate='" + transDate + '\'' +
                ", transTime='" + transTime + '\'' +
                ", payType='" + payType + '\'' +
                ", payAmt=" + payAmt +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getTransSerno() {
        return transSerno;
    }

    public void setTransSerno(String transSerno) {
        this.transSerno = transSerno;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public Bill(int id, int userId, String billName, String transSerno, String transDate, String transTime, String payType, BigDecimal payAmt) {

        this.id = id;
        this.userId = userId;
        this.billName = billName;
        this.transSerno = transSerno;
        this.transDate = transDate;
        this.transTime = transTime;
        this.payType = payType;
        this.payAmt = payAmt;
    }
}
