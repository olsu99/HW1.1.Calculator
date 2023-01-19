public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int plus = calc.plus.apply(1, 2);
        calc.println.accept("1 + 2 = " + plus);

        int minus = calc.minus.apply(5, 5);
        calc.println.accept("5 - 5 = " + minus);

        int multiply = calc.multiply.apply(2, 3);
        calc.println.accept("2 * 3 = " + multiply);

        int devide = calc.devide.apply(5, 0);
        calc.println.accept("5 / 0 = " + devide);

        int pow = calc.pow.apply(6);
        calc.println.accept("6 * 6 = " + pow);

        int abs = calc.abs.apply(-2);
        calc.println.accept("(-2) * (-1) = " + abs);

        boolean isPositive = calc.isPositive.test(6);
        calc.println.accept("6 is positive: " + isPositive);
    }
}
