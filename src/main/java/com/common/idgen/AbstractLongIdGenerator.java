package com.common.idgen;

public abstract class AbstractLongIdGenerator implements IdGenerator {
    @Override
    public Object nextId() {
        return this.nextLongId();
    }

    public abstract Long nextLongId();
}
