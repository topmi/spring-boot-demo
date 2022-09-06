package com.mx.springbootoffice.group;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class MxSelectImportB implements DeferredImportSelector {

    @Override
    public Class<? extends Group> getImportGroup() {
        System.out.println("MxSelectImportB.getImportGroup");
        return MxGroupA.class;
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("MxSelectImportB.selectImports");
        return new String[0];
    }
}
