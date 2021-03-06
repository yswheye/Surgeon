package com.surgeon.weaving.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Called before target method called.
 */
@Retention(CLASS)
@Target({METHOD})
public @interface ReplaceBefore {
    /**
     * The target method reference
     */
    String ref();

    /**
     * Extra mark,Usually used in override.
     */
    String extra() default "";
}
