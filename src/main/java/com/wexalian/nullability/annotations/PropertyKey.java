package com.wexalian.nullability.annotations;

import com.wexalian.nullability.annotations.meta.TypeQualifier;
import com.wexalian.nullability.annotations.meta.When;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@TypeQualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PropertyKey {
    When when() default When.ALWAYS;
}
