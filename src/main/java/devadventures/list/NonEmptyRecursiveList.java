package devadventures.list;

import static devadventures.list.ListModule.list;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class NonEmptyRecursiveList<T> implements RecursiveList<T> {

    private final T head;

    private final RecursiveList<T> tail;

    public NonEmptyRecursiveList(T head, RecursiveList<T> tail) {
        super();
        this.head = head;
        this.tail = tail;
    }

    @Override
    public T head() {
        return head;
    }

    @Override
    public RecursiveList<T> tail() {
        return tail;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void forEach(Consumer<T> consumer) {
        consumer.accept(head());
        tail().forEach(consumer);
    }

    @Override
    public RecursiveList<T> filter(Function<T, Boolean> f) {
        if (f.apply(head())) {
            return list(head(), tail().filter(f));
        }
        return tail().filter(f);
    }

    @Override
    public Optional<T> findFirst() {
        return Optional.of(head());
    }

    @Override
    public <U> RecursiveList<U> map(Function<T, U> f) {
        return list(f.apply(head()), tail().map(f));
    }

    @Override
    public <T2> T2 foldLeft(T2 seed, BiFunction<T2, T, T2> f) {
        return tail().foldLeft(f.apply(seed, head()), f);
    }

    @Override
    public <T2> T2 foldRight(T2 seed, BiFunction<T, T2, T2> f) {
        return f.apply(head(), tail().foldRight(seed, f));
    }

}
