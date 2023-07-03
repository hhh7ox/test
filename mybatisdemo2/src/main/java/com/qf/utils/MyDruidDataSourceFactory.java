package com.qf.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

import javax.sql.DataSource;

/**
 * create by hhh7ox on 2022/5/17 18:58
 */
public class MyDruidDataSourceFactory extends PooledDataSourceFactory {
    public MyDruidDataSourceFactory(){
        this.dataSource = new DruidDataSource();
    }
}
