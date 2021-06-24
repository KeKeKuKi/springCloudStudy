package com.zzz.cloud.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zzz.cloud.common.base.BaseEntity;
import lombok.Data;


@Data
@TableName("payment")
public class Payment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("serial")
    private String serial;


}
