package com.qf.test;

import com.qf.mapper.ProductMapper;
import com.qf.pojo.Product;
import com.qf.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

public class TestProductMapper {

    @Test
    public void testSelectProductAndOrder(){
        ProductMapper mapper = MyBatisUtils.getMapper(ProductMapper.class);
        List<Product> products = mapper.selectProductAndOrder();
        System.out.println(products);

    }

    @Test
    public void testSelectProductAndOrderAndUser(){
        ProductMapper mapper = MyBatisUtils.getMapper(ProductMapper.class);
        List<Product> products = mapper.selectProductAndOrderAndUser();
        System.out.println(products);

    }
}
