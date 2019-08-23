package com.kayak.dubbo_common.service;

import com.kayak.dubbo_common.pojo.Bill;

import java.util.List;

/**
 * Created by JayJ on 2019/8/15.
 **/
public interface IBillService {
    List<Bill> listBill(int userId);
}
