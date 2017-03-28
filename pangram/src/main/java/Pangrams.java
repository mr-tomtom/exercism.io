import java.util.Arrays;

public class Pangrams {

    public static boolean isPangram(String testPan) {

        char[] isPan = testPan.toLowerCase().replaceAll("[^a-z]*", "").toCharArray();
        Arrays.sort(isPan);
        int counter = 0;

        for (int i = 0; i < isPan.length - 1; i++) {
            if (isPan[i] == isPan[i + 1]) {
                counter++;
            }
        }
        return (isPan.length - counter == 26);
    }
}
