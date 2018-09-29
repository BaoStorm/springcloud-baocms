package com.baostorm.baocms.base.dto;

import java.io.Serializable;

/**
 * @author BaoStorm
 */
public class BaseQuery implements Serializable {
    private static final long serialVersionUID = 7765246341518608431L;

    /**
     * 当前页
     */
    private Integer pageNum = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 10;

    /**
     * 排序
     */
    private String orderBy;
}
