package com.wexalian.nullability.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The annotated element could be null under some circumstances.
 * <p>
 * In general, this means developers will have to read the documentation to
 * determine when a null value is acceptable and whether it is necessary to
 * check for a null value.
 * <p>
 * When this annotation is applied to a method it applies to the method return value.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Nullable {

}
