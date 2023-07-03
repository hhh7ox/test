package com.qf.mapper;

import com.qf.pojo.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> selectProductAndOrder();

    List<Product> selectProductAndOrderAndUser();
}
