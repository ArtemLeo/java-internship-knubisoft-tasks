package com.knubisoft.tasks.algorithm.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Add implementation class and tests
 */
public interface ConstructorUtils {

    <T> T invokeConstructor(Class<T> cls, Object... args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;

    <T> Constructor<T> getMatchingAccessibleConstructor(Class<T> cls, Class<?>... parameterTypes);
}
