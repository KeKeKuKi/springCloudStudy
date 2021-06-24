package com.zzz.cloud.common.common;

import lombok.Data;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: CommonResult
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/6/2411:21
 */
@Data
public class CommonResult <T>{
    private Integer code;

    private Boolean success;

    private String mes;

    private T data;

    public CommonResult(){
    }

    public CommonResult(int code, boolean success, String mes, T data) {
        this.code = code;
        this.success = success;
        this.data = data;
        this.mes = mes;
    }

    public CommonResult<T> ofSuccess(T data){
        return new CommonResult<T>(200, true, "成功", data);
    }

    public CommonResult<T> ofFail(String mes){
        return new CommonResult<>(500, false, mes, null);
    }
}
