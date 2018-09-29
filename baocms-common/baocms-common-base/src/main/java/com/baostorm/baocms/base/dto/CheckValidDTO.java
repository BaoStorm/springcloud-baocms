package com.baostorm.baocms.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author BaoStorm
 */
@Data
@ApiModel
public class CheckValidDTO implements Serializable {
    private static final long serialVersionUID = 8911003472930624013L;

    /**
     * 校验的参数值
     */
    @ApiModelProperty(value = "校验参数值")
    private String validValue;

    /**
     * 参数类型(列)
     */
    @ApiModelProperty(value = "参数类型")
    private String type;
}
