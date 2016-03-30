package com.chernobyl;

import java.util.concurrent.ThreadLocalRandom;

public class Chernobyl {

    public static void nuke() {
        throw new RuntimeException();
    }

    public static void nuke(RuntimeException exception) {
        throw exception;
    }

    public static void nuke(RuntimeException exception, Integer probability) {
        if (probability >= 100) {
            nuke(exception);
        } else {
            int random = ThreadLocalRandom.current().nextInt(0, 100);
            if (random <= probability) {
                nuke(exception);
            }
        }
    }
}
