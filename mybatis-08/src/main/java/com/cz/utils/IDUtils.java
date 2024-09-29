package com.cz.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class IDUtils {
    public static String gentID() {
        return UUID.randomUUID().toString().replaceAll("-", ".");
    }
    @Test
    public void test() {
        System.out.println(IDUtils.gentID());
    }
}
