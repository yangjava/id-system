package com.common.idgen;

/**
 * 获取Long类型的ID
 */
public interface LongIdGenerator extends  IdGenerator{

    @Override
    Long nextId();
}
