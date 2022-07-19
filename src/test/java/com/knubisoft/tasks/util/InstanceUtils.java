package com.knubisoft.tasks.util;

import org.reflections.Reflections;

import java.util.Set;

public class InstanceUtils {

    public static <T> T of(Class<T> clazz) {
        Reflections reflections = new Reflections("com.knubisoft");
        Set<Class<? extends T>> subTypesOf = reflections.getSubTypesOf(clazz);

        if (subTypesOf.isEmpty()) {
            throw new RuntimeException("Couldn't find implementation for class " + clazz);
        }

        Class<? extends T> targetImplementation = subTypesOf.iterator().next();
        try {
            return targetImplementation.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Couldn't initialize " + targetImplementation.getSimpleName());
        }
    }
}
