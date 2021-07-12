package com.zzz.springcloud.payment.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zzz.springcloud.mybatis.common.BaseEntity;
import lombok.Data;


@Data
@TableName("payment")
public class Payment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("serial")
    private String serial;


}
