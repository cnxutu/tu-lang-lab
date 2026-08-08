package com.tu.languagelab.jvm.classloader;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ClassLoaderObservationDemoTest {
    @Test
    void distinguishesApplicationAndBootstrapBoundary() {
        assertTrue(ClassLoaderObservationDemo.describe(String.class).endsWith("bootstrap"));
        assertTrue(ClassLoaderObservationDemo.describe(ClassLoaderObservationDemo.class).contains("->"));
    }
}
