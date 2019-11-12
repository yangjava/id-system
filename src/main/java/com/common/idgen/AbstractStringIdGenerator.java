package com.common.idgen;

public abstract class AbstractStringIdGenerator implements IdGenerator {
    @Override
    public Object nextId() {
        return this.nextStringId();
    }

    public abstract String nextStringId();
}
