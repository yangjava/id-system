package com.common.idgen;

/**
 * 生成String类型的ID
 */
public interface StringIdGenerator extends IdGenerator {
    @Override
    String nextId();
}
