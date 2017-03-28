
public class Acronym {

    public static String generate(String phrase) {

        StringBuilder acronym = new StringBuilder();
        String[] split = phrase.replaceAll("-", " ").split(" ");

        for (String word : split) {
            acronym.append(word.charAt(0));

            for (int i=1; i<word.length()-1;i++) {

                if (Character.isUpperCase(word.charAt(i)) && Character.isLowerCase(word.charAt(i-1))) {
                    acronym.append(word.charAt(i));
                }
            }
        }
        return acronym.toString().toUpperCase();
    }
}