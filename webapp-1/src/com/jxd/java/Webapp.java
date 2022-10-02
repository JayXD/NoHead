package com.jxd.java;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.spi.HttpServerProvider;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Webapp {
    public static void serverStart() throws IOException {
        HttpServerProvider provider = HttpServerProvider.provider();
        HttpServer httpserver = provider.createHttpServer(new InetSocketAddress(8000), 100);

        httpserver.createContext("/", httpExchange -> {
            Headers responseHeaders = httpExchange.getRequestHeaders();
            responseHeaders.set("content-type", "application/json;charset=utf-8");
            httpExchange.sendResponseHeaders(200, -1);
            httpExchange.close();
        });
        httpserver.setExecutor(null);
        httpserver.start();
        System.out.println("server started");
    }

    public static void main(String[] args) throws IOException {
        serverStart();
    }
}
