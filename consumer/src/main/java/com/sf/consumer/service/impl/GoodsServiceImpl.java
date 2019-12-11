package com.sf.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sf.api.entity.Product;
import com.sf.api.service.ProductService;
import com.sf.consumer.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Date 2019/11/8 15:48
 * @Created by 01390173
 */

@Service
public class GoodsServiceImpl implements GoodsService {

    @Reference
    private ProductService productService;

    @Override
    public Product getProduct() {
        return productService.get();
    }
}
