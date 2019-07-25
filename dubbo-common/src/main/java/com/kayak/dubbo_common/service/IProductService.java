package com.kayak.dubbo_common.service;

import com.kayak.dubbo_common.pojo.Product;

import java.util.List;

/**
 * Created by JayJ on 2019/7/23.
 **/
public interface IProductService {
    List<Product> getProdList();
}
