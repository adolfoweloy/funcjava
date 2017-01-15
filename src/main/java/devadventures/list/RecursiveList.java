package devadventures.list;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public interface RecursiveList<T> {

    T head();

    RecursiveList<T> tail();

    boolean isEmpty();

    void forEach(Consumer<T> consumer);

    RecursiveList<T> filter(Function<T, Boolean> f);

    Optional<T> findFirst();

    <U> RecursiveList<U> map(Function<T, U> f);

    <T2> T2 foldLeft(T2 seed, BiFunction<T2, T, T2> f);

    <T2> T2 foldRight(T2 seed, BiFunction<T, T2, T2> f);
}