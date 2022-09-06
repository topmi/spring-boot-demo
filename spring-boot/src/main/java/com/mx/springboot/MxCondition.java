package com.mx.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class MxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes =  metadata.getAnnotationAttributes(ConditionalOnClass.class.getName());
        String className = (String) annotationAttributes.get("value");
        try {
            context.getClassLoader().loadClass(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

}
