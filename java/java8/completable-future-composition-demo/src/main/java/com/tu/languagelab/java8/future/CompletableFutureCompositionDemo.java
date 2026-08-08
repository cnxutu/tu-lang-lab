package com.tu.languagelab.java8.future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class CompletableFutureCompositionDemo { public static void main(String[] args) { ExecutorService executor = Executors.newFixedThreadPool(2); try { System.out.println(new ProfileLoader(executor).loadProfile("u1").join()); } finally { executor.shutdown(); } } }
