package com.mx.springbootoffice.group;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;

public class MxGroupB implements DeferredImportSelector.Group {


    @Override
    public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
        System.out.println("MxGroupB.process");
        System.out.println(selector);
    }

    @Override
    public Iterable<Entry> selectImports() {
        System.out.println("MxGroupB.selectImports");
        return new ArrayList<>();
    }
}
