package com.sf.consumer.controller;

import com.sf.api.entity.Product;
import com.sf.consumer.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2019/11/8 15:57
 * @Created by 01390173
 */

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods")
    public Product getGoods() {
        return goodsService.getProduct();
    }
}
