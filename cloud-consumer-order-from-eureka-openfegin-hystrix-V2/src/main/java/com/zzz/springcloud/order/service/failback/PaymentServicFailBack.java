package com.zzz.springcloud.order.service.failback;

import com.zzz.cloud.common.common.CommonResult;
import com.zzz.springcloud.order.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: PaymentServicFailBack
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/819:45
 */
@Component
public class PaymentServicFailBack implements PaymentService {
    @Override
    public CommonResult<Object> list() {
        return CommonResult.ofSuccess("list-客户端服务降级");
    }

    @Override
    public CommonResult<Object> listSometimesError() {
        return CommonResult.ofSuccess("listSometimesError 客户端服务降级");
    }

    @Override
    public CommonResult<String> fuseTest(Integer id) {
        return CommonResult.ofSuccess("fuseTest 客户端服务降级");
    }
}
