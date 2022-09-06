package com.mx.springbootoffice.group;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class MxSelectImportC implements DeferredImportSelector {

    @Override
    public Class<? extends Group> getImportGroup() {
        System.out.println("MxSelectImportC.getImportGroup");
        return MxGroupB.class;
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("MxSelectImportC.selectImports");
        return new String[0];
    }
}
