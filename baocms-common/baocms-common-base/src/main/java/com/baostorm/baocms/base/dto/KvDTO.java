package com.baostorm.baocms.base.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author BaoStorm
 */
@Data
public class KvDTO<K,V> implements Serializable {

    private static final long serialVersionUID = -5833673374356950373L;

    /**
     * Instantiates a new Kv dto.
     */
    public KvDTO() {
    }

    /**
     * Instantiates a new Kv dto.
     *
     * @param key   the key
     * @param value the value
     */
    public KvDTO(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * key
     */
    private K key;
    /**
     * value
     */
    private V value;
}
