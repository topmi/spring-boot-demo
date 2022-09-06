package com.mx.springboot;

import com.mx.springboot.autoconfigure.webservices.WebServer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.Map;

public class MxSpringApplication {

    public static void run(Class clazz) {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(clazz);
        applicationContext.refresh();

        WebServer webServer = getWebServer(applicationContext);
        webServer.start();
    }

    private static WebServer getWebServer(AnnotationConfigWebApplicationContext applicationContext) {
        // 依赖 tomcat jetty undertow
        Map<String, WebServer> beansOfType = applicationContext.getBeansOfType(WebServer.class);

        if (beansOfType.isEmpty()) {
            throw new NullPointerException();
        }

        if (beansOfType.size() > 1) {
            throw new IllegalStateException();
        }

        return beansOfType.values().stream().findFirst().get();
    }

}
