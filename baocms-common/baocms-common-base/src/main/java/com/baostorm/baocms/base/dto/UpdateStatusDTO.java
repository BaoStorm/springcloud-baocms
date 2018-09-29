package com.baostorm.baocms.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author BaoStorm
 */
@Data
@ApiModel(value = "更改状态")
public class UpdateStatusDTO implements Serializable {

    private static final long serialVersionUID = 8897930719641890629L;
    /**
     * 角色ID
     */
    @ApiModelProperty(value = "角色ID")
    private Long id;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer status;
}