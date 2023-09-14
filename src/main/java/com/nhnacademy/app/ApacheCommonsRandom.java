package com.nhnacademy.app;

import org.apache.commons.math3.random.RandomDataGenerator;

public class ApacheCommonsRandom {

    public static void main(String[] args) {
        RandomDataGenerator rand = new RandomDataGenerator();

        System.out.println("난수 : " + rand.nextInt(0, 100));

    }
}
