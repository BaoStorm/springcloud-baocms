package com.baostorm.baocms.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author BaoStorm
 */
@ApiModel
@Data
public class GaodeBaseDTO implements Serializable {
    private static final long serialVersionUID = 3093588006232180378L;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String status;

    /**
     * 响应信息
     */
    @ApiModelProperty(value = "响应信息")
    private String info;

    /**
     * 响应编码
     */
    @ApiModelProperty(value = "响应编码")
    private String infocode;
}
