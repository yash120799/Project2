package com.crossasyst.test1;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Log4j2 @Data
public class Demo {

    public static void main(String[] args) {
        Person p= new Person();

        p.setFirstName("Yash");
        log.info(p.getFirstName());
        p.setLastName("goyal");
        log.info(p.getLastName());


    }
}