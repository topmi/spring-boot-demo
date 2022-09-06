package com.mx.springbootoffice.group;

import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

public class MxGroupA implements DeferredImportSelector.Group {
    List<Entry> list = new ArrayList<>();

    @Override
    public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
        System.out.println("MxGroupA.process");
        System.out.println(selector);
//        list.add(selector)
//        ((AutoConfigurationImportSelector)selector)
    }

    @Override
    public Iterable<Entry> selectImports() {
        System.out.println("MxGroupA.selectImports");
        return list;
    }
}
