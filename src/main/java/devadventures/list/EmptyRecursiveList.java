package devadventures.list;

import static devadventures.list.ListModule.empty;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class EmptyRecursiveList<T> implements RecursiveList<T> {

    public EmptyRecursiveList() {
    }

    public T head() {
        throw new RuntimeException("the list is empty");
    }

    public RecursiveList<T> tail() {
        throw new RuntimeException("the list is empty");
    }

    public boolean isEmpty() {
        return true;
    }

    @Override
    public void forEach(Consumer<T> consumer) {
    }

    @Override
    public RecursiveList<T> filter(Function<T, Boolean> f) {
        return empty();
    }

    @Override
    public Optional<T> findFirst() {
        return Optional.ofNullable(null);
    }

    @Override
    public <U> RecursiveList<U> map(Function<T, U> f) {
        return empty();
    }

    @Override
    public <T2> T2 foldLeft(T2 seed, BiFunction<T2, T, T2> f) {
        return seed;
    }

    @Override
    public <T2> T2 foldRight(T2 seed, BiFunction<T, T2, T2> f) {
        return seed;
    }

}
