package com.mx.springboot;

import com.mx.springboot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class MxSelectImport implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        ServiceLoader<AutoConfiguration> serviceLoader = ServiceLoader.load(AutoConfiguration.class);
        List<String> list = new ArrayList<>();
        for (AutoConfiguration autoConfiguration : serviceLoader) {
            list.add(autoConfiguration.getClass().getName());
        }
        return list.toArray(new String[list.size()]);

    }
}
