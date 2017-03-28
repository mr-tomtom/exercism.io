
public class Raindrops {

    public static String convert(int input) {

        StringBuilder output = new StringBuilder();

        output.append(input % 3 == 0 ? "Pling" : "");
        output.append(input % 5 == 0 ? "Plang" : "");
        output.append(input % 7 == 0 ? "Plong" : "");
        output.append(output.length() < 1 ? input : "");

        return output.toString();
    }
}