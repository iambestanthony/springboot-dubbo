package com.kayak.dubboconsume.controller;

import com.alibaba.dubbo.common.utils.Log;
import com.kayak.dubbo_common.pojo.Product;
import com.kayak.dubbo_common.service.IProductService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJ on 2019/7/25.
 **/
@RestController
@RequestMapping("/prod")
public class ProductController {
    @Resource
    private IProductService productService;
    @RequestMapping("/list")
    @ResponseBody
    public List<Product> list(){
        
        return productService.getProdList();
    }
}
