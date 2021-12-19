import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y > 0) return x / y;
        else {
            System.out.println("Деление на ноль запрещено!");
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> {
        int i = x > 0 ? x : x * -1;
        return i;
    };
    Predicate<Integer> IsPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
