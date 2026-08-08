package com.tu.languagelab.java8.fundamentals.network;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/** 在本地临时 HTTP 服务上演示 JDK8 客户端生命周期，避免教程依赖外部网络。 */
public final class LocalHttpClient {
    private LocalHttpClient() { }

    public static String getGreeting() throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(0), 0);
        server.createContext("/hello", LocalHttpClient::respondHello);
        server.start();
        try {
            URL url = new URL("http://127.0.0.1:" + server.getAddress().getPort() + "/hello");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(2_000);
            connection.setReadTimeout(2_000);
            // HttpURLConnection 展示 JDK8 中建立连接、设置超时、读取响应的基本生命周期。
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                return reader.lines().collect(Collectors.joining());
            } finally {
                connection.disconnect();
            }
        } finally {
            server.stop(0);
        }
    }

    private static void respondHello(HttpExchange exchange) throws java.io.IOException {
        byte[] body = "hello-java8".getBytes(StandardCharsets.UTF_8);
        exchange.sendResponseHeaders(200, body.length);
        try (OutputStream output = exchange.getResponseBody()) {
            output.write(body);
        }
    }
}
