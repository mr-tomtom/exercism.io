public class Hamming {

    public static int compute(String a, String a1) {

        if (a.length() != a1.length()) {
            throw new IllegalArgumentException();
        }

        int hamDiff = 0;
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) != a1.charAt(i)) {
                hamDiff++;
            }
        }
        return hamDiff;
    }
}
