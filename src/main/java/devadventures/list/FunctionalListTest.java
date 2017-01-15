package devadventures.list;

import static devadventures.list.ListModule.empty;
import static devadventures.list.ListModule.list;

public class FunctionalListTest {

    public static void main(String[] args) {

        RecursiveList<Integer> values = list(1, list(2, list(3, list(4, empty()))));

        Integer total = values
            .filter((n) -> n % 2 == 0)
            .map((n) -> n * 2)
            .foldRight(0, (n, m) -> n + m);

        System.out.println(total);
    }

    @SuppressWarnings("unused")
    private static void filterExample() {
        Integer num = list(1, list(2, empty()))
            .filter((item) -> item % 2 == 0)
            .findFirst()
            .orElse(0);

        System.out.println(num);
    }

    @SuppressWarnings("unused")
    private static void printDoubles() {
        RecursiveList<Integer> numbers = list(1, list(2, list(3, empty())));

        numbers
            .map((item) -> item * 2)
            .forEach(item -> System.out.println(item));

    }
    @SuppressWarnings("unused")
    private static void iterate() {
        list(1, list(2, empty()))
            .forEach(item -> System.out.println(item));
    }

}
