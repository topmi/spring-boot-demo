package com.mx.springboot.autoconfigure.webservices;

import com.mx.springboot.ConditionalOnClass;
import com.mx.springboot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.MergedAnnotations;

@Configuration
public class WebServerAutoConfiguration implements AutoConfiguration {

    @Bean
    @ConditionalOnClass("org.apache.catalina.startup.Tomcat")
//    @ConditionalOnMissingBean(value = ServletWebServerFactory.class, search = SearchStrategy.CURRENT)
    public TomcatWebServer tomcatWebServer() {
        return new TomcatWebServer();
    }

    @Bean
    @ConditionalOnClass("org.eclipse.jetty.server.Server")
    public JettyWebServer jettyWebServer() {
        return new JettyWebServer();
    }
}
