package com.common.idgen.test;

import com.common.idgen.UuidStringIdGenerator;

public class IdTest {

    public static void main(String[] args) {
        UuidStringIdGenerator idGenerator=new UuidStringIdGenerator();
        String id = idGenerator.nextStringId();
        Person person=new Person();
        person.setPersonId(id);

    }
}
