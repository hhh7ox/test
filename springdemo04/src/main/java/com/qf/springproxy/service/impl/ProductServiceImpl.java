package com.qf.springproxy.service.impl;

import com.qf.springproxy.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * create by hhh7ox on 2022/5/18 17:57
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public String buyProduct(Double price) {
        return "购买商品花费了 "+ price;
    }
}
