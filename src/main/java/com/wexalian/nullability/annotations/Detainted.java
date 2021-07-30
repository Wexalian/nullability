package com.wexalian.nullability.annotations;

import com.wexalian.nullability.annotations.meta.TypeQualifierNickname;
import com.wexalian.nullability.annotations.meta.When;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@TypeQualifierNickname
@Untainted(when = When.ALWAYS)
@Retention(RetentionPolicy.RUNTIME)
public @interface Detainted {

}
