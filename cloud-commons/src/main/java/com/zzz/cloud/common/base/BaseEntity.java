package com.zzz.cloud.common.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: BaseEntity
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/6/2411:45
 */
@Data
public class BaseEntity implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
}
