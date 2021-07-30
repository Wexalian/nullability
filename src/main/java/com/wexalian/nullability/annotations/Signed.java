package com.wexalian.nullability.annotations;

import com.wexalian.nullability.annotations.meta.TypeQualifierNickname;
import com.wexalian.nullability.annotations.meta.When;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Used to annotate a value of unknown sign.
 */
@Documented
@TypeQualifierNickname
@Nonnegative(when = When.UNKNOWN)
@Retention(RetentionPolicy.RUNTIME)
public @interface Signed {

}
