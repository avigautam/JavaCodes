package com.avi.jvm;

import org.junit.platform.commons.util.ReflectionUtils;

import java.lang.reflect.Method;

public class RuntimeTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Method versionMethod = Runtime.class.getMethod("version");
        System.out.println(versionMethod.getName());
        Object version = ReflectionUtils.invokeMethod(versionMethod, null);
        Method majorMethod = version.getClass().getMethod("major");
        int major = (int) ReflectionUtils.invokeMethod(majorMethod, version);
        System.out.println(major);
    }
}
