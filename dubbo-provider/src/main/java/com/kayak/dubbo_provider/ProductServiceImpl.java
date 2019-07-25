package com.kayak.dubbo_provider;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.kayak.dubbo_common.pojo.Product;
import com.kayak.dubbo_common.service.IProductService;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JayJ on 2019/7/23.
 **/
@Path("/product")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
@Service
public class ProductServiceImpl implements IProductService {
    @GET
    @Path("/getProdList")
    @Override
    public List<Product> getProdList() {
        List<Product> prod = new ArrayList<>();
        prod.add(new Product("P201907231741", "鸭嘴帽", 36.30f));
        prod.add(new Product("P201907231742", "iphone 5s", 3440.00f));
        prod.add(new Product("P201907231743", "huawei P20", 4500.00f));
        return prod;
    }
}
