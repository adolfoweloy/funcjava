package devadventures.list;

public class ListModule {

    private static final RecursiveList<? extends Object> EMPTY = new EmptyRecursiveList<Object>();

    public static <T> RecursiveList<T> list(T head, RecursiveList<T> tail) {
        return new NonEmptyRecursiveList<T>(head, tail);
    }

    @SuppressWarnings("unchecked")
    public static <T> RecursiveList<T> empty() {
        return (RecursiveList<T>) ListModule.EMPTY;
    }

}