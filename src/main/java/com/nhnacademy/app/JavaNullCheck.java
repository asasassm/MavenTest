package com.nhnacademy.app;

import java.util.Objects;

public class JavaNullCheck {
    public static void main(String[] args) {
        String str = "a";

        if (!Objects.isNull(str)) {
            System.out.println("있음 ");
        }
    }
}
