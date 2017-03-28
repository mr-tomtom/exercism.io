

public class Accumul {

    public static String accum(String s) {

        String all = "";

        String[] splitStr = s.split("-");

        for (String word:splitStr) {
            System.out.println(word);
        }

        for (String word : splitStr) {
            all = all + word;
        }

        return all;
    }
}
