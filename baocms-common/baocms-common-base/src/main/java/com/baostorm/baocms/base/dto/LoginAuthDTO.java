package com.baostorm.baocms.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author BaoStorm
 */
@Data
@ApiModel(value = "登录人信息")
public class LoginAuthDTO implements Serializable {
    private static final long serialVersionUID = -2734803283111186627L;

    @ApiModelProperty(value = "用户ID")
    private Long userId;
    @ApiModelProperty(value = "登录名")
    private String loginName;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "组织ID")
    private Long groupId;
    @ApiModelProperty(value = "组织名称")
    private String groupName;

    public LoginAuthDTO() {
    }

    public LoginAuthDTO(Long userId, String loginName, String userName) {
        this.userId = userId;
        this.loginName = loginName;
        this.userName = userName;
    }

    public LoginAuthDTO(Long userId, String loginName, String userName, Long groupId, String groupName) {
        this.userId = userId;
        this.loginName = loginName;
        this.userName = userName;
        this.groupId = groupId;
        this.groupName = groupName;
    }
}
