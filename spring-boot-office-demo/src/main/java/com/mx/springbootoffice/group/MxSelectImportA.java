package com.mx.springbootoffice.group;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class MxSelectImportA implements DeferredImportSelector {

    @Override
    public Class<? extends Group> getImportGroup() {
        System.out.println("MxSelectImportA.getImportGroup");
        return MxGroupA.class;
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("MxSelectImportA.selectImports");
        return new String[0];
    }
}
