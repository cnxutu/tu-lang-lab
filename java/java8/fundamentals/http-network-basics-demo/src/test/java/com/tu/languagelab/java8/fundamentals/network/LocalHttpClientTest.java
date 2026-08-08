package com.tu.languagelab.java8.fundamentals.network;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LocalHttpClientTest {
    @Test
    void exercisesHttpLifecycleWithoutExternalNetwork() throws Exception {
        assertEquals("hello-java8", LocalHttpClient.getGreeting());
    }
}
