package com.mx.springbootoffice.filter;

import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import java.io.IOException;


public class MxTypeExcluterFilter extends TypeExcludeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        return metadataReader.getAnnotationMetadata().getClassName().equals("com.mx.springbootoffice.service.UserService");
    }
}
