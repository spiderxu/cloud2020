package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: xuzhi
 * @date: 2020/10/28 10:57
 */
public interface PaymentService {
    public int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
