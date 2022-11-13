package com.wexalian.nullability.function;

import com.wexalian.nullability.annotations.Nonnull;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface NonnullBiConsumer<T1, T2> extends BiConsumer<T1, T2> {
    @Override
    void accept(@Nonnull T1 t1, @Nonnull T2 t2);
}
