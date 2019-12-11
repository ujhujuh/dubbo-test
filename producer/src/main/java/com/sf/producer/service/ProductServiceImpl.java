package com.sf.producer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sf.api.entity.Product;
import com.sf.api.service.ProductService;

import java.math.BigDecimal;

/**
 * @Description TODO
 * @Date 2019/11/8 15:48
 * @Created by 01390173
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product get() {
        Product p = new Product();
        p.setId(1L);
        p.setProductName("惠普笔记本");
        p.setPrice(new BigDecimal(4500));
        p.setAddress("广东深圳");
        return p;
    }

}
