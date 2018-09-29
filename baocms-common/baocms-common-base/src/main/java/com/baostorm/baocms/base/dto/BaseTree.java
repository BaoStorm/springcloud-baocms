package com.baostorm.baocms.base.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @param <E>
 * @param <ID>
 *
 * @author BaoStorm
 */
@Data
public class BaseTree<E,ID> implements Serializable {
    private static final long serialVersionUID = -5432065813258184319L;

    /**
     * ID
     */
    private ID id;

    /**
     * 父ID
     */
    private ID pid;

    /**
     * 是否含有子节点
     */
    private boolean hasChild = false;

    /**
     * 子节点集合
     */
    private List<E> children;
}
