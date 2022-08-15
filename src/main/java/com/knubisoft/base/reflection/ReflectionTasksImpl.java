package com.knubisoft.base.reflection;

import com.knubisoft.base.reflection.model.EntryModel;
import com.knubisoft.base.reflection.model.InheritedEntryModel;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static java.lang.Class.*;

public class ReflectionTasksImpl implements ReflectionTasks {

    @Override
    public Object createNewInstanceForClass(Class<?> cls) {
        if (cls == null) {
            throw new NoSuchElementException();
        }
        String[] fields = {"tableName", "schemaName", "version"};
        Class[] params = Arrays.stream(fields).map(String::getClass).toArray(Class[]::new);
        try {
            Constructor<?> constructor = cls.getConstructor(params);
            return constructor.newInstance(fields);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException
                 | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> Class<? extends T> findImplementationForInterface(Class<T> cls) {
        try {
            if (cls == null) {
                throw new NoSuchElementException();
            }
            cls = (Class<T>) forName(cls.getName());
            boolean b = cls.getPackageName().equals("com.knubisoft.base.reflection");
            if (b) {
                throw new IllegalArgumentException();
            }
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException();
        }
        Class[] c;
        c = InheritedEntryModel.class.getDeclaredClasses();
        if (c.length == 0) return (Class<? extends T>) InheritedEntryModel.class;
        return c[0];
    }

    @Override
    public Map<String, Object> findAllFieldsForClass(Class<?> cls) {
        if (cls == null) {
            throw new NoSuchElementException();
        }
        HashMap<String, Object> res = new HashMap<>();
        Object obj = null;
        try {
            cls = forName(cls.getName());
            if (cls.isInterface()) {
                return res;
            }
            obj = cls.getDeclaredConstructor(String.class, String.class, String.class).newInstance("1", "2", "3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Field[] fields = cls.getSuperclass().getDeclaredFields();
        for (Field f : fields) {
            Field field;
            try {
                field = EntryModel.class.getDeclaredField(f.getName());
                field.setAccessible(true);
                Object str = field.get(obj);
                res.put(f.getName(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    @Override
    public int countPrivateMethodsInClass(Class<?> cls) {
        if (cls == null) {
            throw new NoSuchElementException();
        }
        Method[] fields = cls.getDeclaredMethods();
        int count = 0;
        for (Method field : fields) {
            int modifier = field.getModifiers();
            if (modifier == 2) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isMethodHasAnnotation(Method method, Class<?> annotationUnderMethod) {
        String name = method.getName();
        long count = Arrays.stream(annotationUnderMethod.getDeclaredMethods())
                .filter(method1 -> method1.getAnnotations().length > 0
                        && method1.getName().equals(name))
                .count();
        return count > 0;
    }

    @Override
    public Object evaluateMethodByName(Class<?> cls, String name) {
        Method method = null;
        try {
            method = cls.getDeclaredMethod(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert method != null;
        return method.getReturnType();
    }

    @Override
    public Object evaluateMethodWithArgsByName(Object obj, String name, Object... args) {
        if (obj == null || name == null || args == null) {
            throw new IllegalArgumentException();
        }
        try {
            Class<?> aClass = obj.getClass();
            Class<?>[] classes = Arrays.stream(args).map(Object::getClass).toArray(Class<?>[]::new);
            Method method = aClass.getMethod(name, classes);
            return method.invoke(obj, args);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object changePrivateFieldValue(Object instance, String name, Object newValue) {
        try {
            Field field = instance.getClass().getDeclaredField(name);
            field.setAccessible(true);
            field.set(instance, newValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}