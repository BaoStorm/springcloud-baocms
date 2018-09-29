package com.baostorm.baocms.base.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShardingContextDTO {
    /**
     * The Sharding total count.
     */
    int shardingTotalCount;
    /**
     * The Sharding item.
     */
    int shardingItem;

    public ShardingContextDTO(final int shardingTotalCount, final int shardingItem) {
        this.shardingTotalCount = shardingTotalCount;
        this.shardingItem = shardingItem;
    }
}
