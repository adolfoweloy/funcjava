package devadventures.list;

public class FatorialTest {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static long factorial(long number) {
        if (number <= 1) return 1;
        return factorial(number - 1) * number;
    }
}
