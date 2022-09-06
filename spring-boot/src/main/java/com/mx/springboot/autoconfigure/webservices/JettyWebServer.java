package com.mx.springboot.autoconfigure.webservices;

import org.springframework.web.context.WebApplicationContext;

public class JettyWebServer implements WebServer {
    @Override
    public void start() {
        System.out.println("Jetty 启动了");
    }
}
