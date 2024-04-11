package ananasovitch.org.library1.service;

import org.junit.jupiter.api.Assertions;

public class ResponseChecker {
    public void checkResponse(Object expected, Object actual) {
        Assertions.assertEquals(expected, actual);
    }
}