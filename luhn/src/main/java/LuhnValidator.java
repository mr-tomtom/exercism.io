import java.util.stream.IntStream;

public class LuhnValidator {

    public boolean isValid(String str) {

        String s = str.trim().replaceAll(" ", "");
        String[] nums = s.split("");
        return s.matches("^\\d{2,}") && total(nums) % 10 == 0;
    }

    private int total(String[] nums) {
        int startDigit = (nums.length & 1) == 0 ? 0 : 1;
        return IntStream.range(0, nums.length)
                .map(i -> (i & 1) == startDigit ? doubleDigit(Integer.parseInt(nums[i])) : Integer.parseInt(nums[i]))
                .sum();
    }

    private int doubleDigit(int x) {
        if (x * 2 > 9) return x * 2 - 9;
        return x * 2;
    }
}