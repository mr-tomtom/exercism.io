import java.util.HashMap;

public class Scrabble {

    private String scrabbleWord;
    private int totalScore = 0;
    private HashMap<Character, Integer> scrabbleScore = new HashMap();

    public Scrabble(String word) {

        scrabbleWord = word == null ? "" : word.toUpperCase();

        scrabbleScore.put('A', 1);
        scrabbleScore.put('E', 1);
        scrabbleScore.put('I', 1);
        scrabbleScore.put('O', 1);
        scrabbleScore.put('U', 1);
        scrabbleScore.put('L', 1);
        scrabbleScore.put('N', 1);
        scrabbleScore.put('R', 1);
        scrabbleScore.put('S', 1);
        scrabbleScore.put('T', 1);
        scrabbleScore.put('D', 2);
        scrabbleScore.put('G', 2);
        scrabbleScore.put('B', 3);
        scrabbleScore.put('C', 3);
        scrabbleScore.put('M', 3);
        scrabbleScore.put('P', 3);
        scrabbleScore.put('F', 4);
        scrabbleScore.put('H', 4);
        scrabbleScore.put('V', 4);
        scrabbleScore.put('W', 4);
        scrabbleScore.put('Y', 4);
        scrabbleScore.put('K', 5);
        scrabbleScore.put('J', 8);
        scrabbleScore.put('X', 8);
        scrabbleScore.put('Q', 10);
        scrabbleScore.put('Z', 10);
    }

    public int getScore() {

            for (int i = 0; i < scrabbleWord.length(); i++) {
                if (scrabbleScore.containsKey(scrabbleWord.charAt(i))) {
                    totalScore = totalScore + scrabbleScore.get(scrabbleWord.charAt(i));
                }
            }
        return totalScore;
    }
}
