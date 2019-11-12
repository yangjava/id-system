package com.common.idgen;

import java.util.UUID;

public class UuidStringIdGenerator extends AbstractStringIdGenerator {
    @Override
    public String nextStringId() {
        return UUID.randomUUID().toString();
    }
}
