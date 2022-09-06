package com.mx.springbootoffice;

import com.mx.springbootoffice.group.MxSelectImportA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(MxSelectImportA.class)
public class OfficeApplication {

    public static void main(String[] args) {
        SpringApplication.run(OfficeApplication.class,args);
    }
}
