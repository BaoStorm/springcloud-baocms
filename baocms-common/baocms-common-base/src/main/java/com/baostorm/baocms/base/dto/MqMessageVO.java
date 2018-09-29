package com.baostorm.baocms.base.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author BaoStorm
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MqMessageVO extends BaseVO {

    private static final long serialVersionUID = -901353579047838784L;

    /**
     * 消息key
     */
    private String messageKey;

    /**
     * topic
     */
    private String messageTopic;

    /**
     * tag
     */
    private String messageTag;

    /**
     * 消息内容
     */
    private String messageBody;

    /**
     * 消息类型: 10 - 生产者 ; 20 - 消费者
     */
    private Integer messageType;

    /**
     * 顺序类型, 0有序 1无序
     */
    private int orderType;

    /**
     * 消息状态
     */
    private Integer status;

    /**
     * 延时级别
     */
    private int delayLevel;
}
