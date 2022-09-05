package com.wexalian.nullability.function;

import com.wexalian.nullability.annotations.Nonnull;

import java.util.function.Supplier;

@FunctionalInterface
public interface NonnullSupplier<T> extends Supplier<T> {
    @Nonnull
    @Override
    T get();
}
