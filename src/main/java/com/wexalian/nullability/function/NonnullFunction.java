package com.wexalian.nullability.function;

import com.wexalian.nullability.annotations.Nonnull;

import java.util.function.Function;

public interface NonnullFunction<T, R> extends Function<T, R> {
    @Override
    @Nonnull
    R apply(@Nonnull T t);
}
