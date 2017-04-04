import java.util.Arrays;import java.util.stream.IntStream;public class SumOfMultiples {    private int[] set;    private int mulMax;    public SumOfMultiples(int mulMax, int[] set) {        this.set = set;        this.mulMax = mulMax;    }    public int getSum() {        return IntStream.range(1, mulMax).filter(i -> isMultiple(i)).sum();    }    private boolean isMultiple(int x) {        return (Arrays.stream(set).mapToDouble(i -> i).anyMatch(i -> (x / i) % 1 == 0));    }}