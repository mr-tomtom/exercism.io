import java.util.stream.IntStream;

public final class Difference {

    static int computeSquareOfSumTo(int sumTo) {
        return square(IntStream.rangeClosed(1, sumTo).sum());
    }

    static int computeSumOfSquaresTo(int squareTo) {
        return IntStream.rangeClosed(1, squareTo).map(Difference::square).sum();
    }

    static int betweenSquareOfSumAndSumOfSquaresTo(int diff) {
        return computeSquareOfSumTo(diff) - computeSumOfSquaresTo(diff);

    }

    static int square(int i) {
        return i * i;
    }
}