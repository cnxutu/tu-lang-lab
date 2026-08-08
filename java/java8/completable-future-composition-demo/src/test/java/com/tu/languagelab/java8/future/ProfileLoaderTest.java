package com.tu.languagelab.java8.future;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Test;
class ProfileLoaderTest { @Test void combinesIndependentResults() { ExecutorService executor = Executors.newSingleThreadExecutor(); try { assertEquals("u1:Ada:42", new ProfileLoader(executor).loadProfile("u1").join()); } finally { executor.shutdown(); } } }
