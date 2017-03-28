import java.util.HashMap;

public class RnaTranscription {

    public static String ofDna(String sample) {
        String result = "";
        HashMap<Character, Character> dnaRna = new HashMap<>();
        dnaRna.put('G', 'C');
        dnaRna.put('C', 'G');
        dnaRna.put('T', 'A');
        dnaRna.put('A', 'U');

        for (int i=0; i<sample.length(); i++) {
            if (dnaRna.containsKey(sample.charAt(i))) {
                result = result + dnaRna.get(sample.charAt(i));
            }
        }
        return result;
    }
}
