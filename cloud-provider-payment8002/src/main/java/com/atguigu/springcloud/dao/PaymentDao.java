package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: xuzhi
 * @date: 2020/10/28 10:44
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
