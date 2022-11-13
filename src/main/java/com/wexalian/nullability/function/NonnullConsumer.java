package com.wexalian.nullability.function;

import com.wexalian.nullability.annotations.Nonnull;

import java.util.function.Consumer;

@FunctionalInterface
public interface NonnullConsumer<T> extends Consumer<T> {
    @Override
    void accept(@Nonnull T t);
}
