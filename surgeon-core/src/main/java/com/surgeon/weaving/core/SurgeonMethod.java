package com.surgeon.weaving.core;


import java.lang.reflect.Method;

/**
 * The replace method wrapper.
 */
public class SurgeonMethod {
    private Class owner;
    private Method newMethod;
    private String args;
    private String types;

    public SurgeonMethod(Class owner, Method newMethod, String args, String types) {
        this.owner = owner;
        this.newMethod = newMethod;
        this.args = args;
        this.types = types;
    }

    public Class getOwner() {
        return owner;
    }

    public Method getNewMethod() {
        return newMethod;
    }

    public String getTypes() {
        return types;
    }

    public String getArgs() {
        return args;
    }
}
