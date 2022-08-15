package com.knubisoft.base.reflection;

import java.lang.reflect.Method;
import java.util.Map;

public class ReflectionTasksImpl implements ReflectionTasks {

    @Override
    public Object createNewInstanceForClass(Class<?> cls) {
        return null;
    }

    @Override
    public <T> Class<? extends T> findImplementationForInterface(Class<T> cls) {
        return null;
    }

    @Override
    public Map<String, Object> findAllFieldsForClass(Class<?> cls) {
        return null;
    }

    @Override
    public int countPrivateMethodsInClass(Class<?> cls) {
        return -1;
    }

    @Override
    public boolean isMethodHasAnnotation(Method method, Class<?> annotationUnderMethod) {
        return false;
    }

    @Override
    public Object evaluateMethodByName(Class<?> cls, String name) {
        return null;
    }

    @Override
    public Object evaluateMethodWithArgsByName(Object obj, String name, Object... args) {
        return null;
    }

    @Override
    public Object changePrivateFieldValue(Object instance, String name, Object newValue) {
        return null;
    }
}