package com.sf.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description TODO
 * @Date 2019/11/8 15:45
 * @Created by 01390173
 */

@Data
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String productName;
    private BigDecimal price;
    private String address;

}
