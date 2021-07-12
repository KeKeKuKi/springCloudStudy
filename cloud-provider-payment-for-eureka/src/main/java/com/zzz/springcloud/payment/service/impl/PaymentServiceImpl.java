package com.zzz.springcloud.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzz.springcloud.payment.entity.Payment;
import com.zzz.springcloud.payment.mapper.PaymentMapper;
import com.zzz.springcloud.payment.service.IPaymentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZhaoZezhong
 * @since 2021-06-24
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

}
