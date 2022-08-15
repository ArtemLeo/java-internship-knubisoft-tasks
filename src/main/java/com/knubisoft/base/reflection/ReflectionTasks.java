package com.knubisoft.base.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public interface ReflectionTasks {
    /**
     * Write a java program to create a new instance (through constructors).
     * Use EntryModel.java and create 3 fields + 3 constructors.
     * Example:
     *  field1
     *  field2
     *  field3
     *
     *  constructor(field1)
     *  constructor(field1, field2)
     *  constructor(field1, field2, field3)
     *
     * In an inherited class create 3 constructors.
     * You can scan only in range of package: com.knubisoft.base.reflection.model.
     * @param cls - your instance.
     * */
    Object createNewInstanceForClass(Class<?> cls);
    /**
     * Write a java program to scan the current interface (ReflectionTasks.java) and find all implementation for it.
     * @param cls - class which will be scanned.
     * */
    <T> Class<? extends T> findImplementationForInterface(Class<T> cls);
    /**
     * Find all fields of an object from the first task and return a map where key is name of field
     * and value is value of field
     * @param cls - class which will be scanned.
     * */
    Map<String, Object> findAllFieldsForClass(Class<?> cls);
    /**
     * Write a Java program and create more fields with different access levels from the first task for your model.
     * Count all private methods in it.
     * @param cls - class which will be scanned.
     * */
    int countPrivateMethodsInClass(Class<?> cls);
    /**
     * Write a java program to get by the method any annotations.
     * You can check if any annotations is exist just checking the size of an array (Annotation[].size).
     * @param method - current method of class.
     * @param clazz - clazz should be scan.
     * */
    boolean isMethodHasAnnotation(Method method, Class<?> clazz);
    /**
     * You have to evaluate the method of class by the name. Here you should find the method without any params
     * You need to return a value which will be returned from a found method.
     * If it's a void method then return just a string if operation is successful.
     *
     * @param cls - class which will be scanned.
     * @param name - name of the method.
     * */
    Object evaluateMethodByName(Class<?> cls, String name) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException;
    /**
     * You have to evaluate the method of class by the name and put to there args.
     * You need to return a value which will be returned from a found method.
     * If it's a void method then return just a string if operation is successful.
     * @param obj - class which will be scanned.
     * @param name - name of the method.
     * @param args - arrays of args will be used in found method.
     * */
    Object evaluateMethodWithArgsByName(Object obj, String name, Object... args);
    /**
     * You have to find the field of the instance by the name and put to there a new value and save it.
     * Return the current instance with a new set up value of the field.
     * @param instance - instance which will be scanned.
     * @param name - name of the field.
     * @param newValue - new value for the field.
     * */
    Object changePrivateFieldValue(Object instance, String name, Object newValue) throws NoSuchFieldException, IllegalAccessException;
}
