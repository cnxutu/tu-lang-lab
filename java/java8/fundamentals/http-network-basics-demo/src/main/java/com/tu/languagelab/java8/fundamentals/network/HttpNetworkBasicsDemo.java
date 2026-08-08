package com.tu.languagelab.java8.fundamentals.network;

public final class HttpNetworkBasicsDemo {
    private HttpNetworkBasicsDemo() { }
    public static void main(String[] args) throws Exception {
        System.out.println(LocalHttpClient.getGreeting());
    }
}
