package com.baostorm.baocms.base.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author BaoStorm
 */
@Data
@AllArgsConstructor
public class MqMessageDTO implements Serializable {
    private static final long serialVersionUID = 1287135796202893433L;
    /**
     * 消息key
     */
    private String messageKey;

    /**
     * topic
     */
    private String messageTopic;
}
