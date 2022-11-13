package com.wexalian.nullability.function;

import com.wexalian.nullability.annotations.Nonnull;

import java.util.function.BiFunction;

public interface NonnullBiFunction<T1, T2, R> extends BiFunction<T1, T2, R> {
    @Override
    @Nonnull
    R apply(@Nonnull T1 t1, @Nonnull T2 t2);
}
