import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class HandshakeCalculator {

    private List<Signal> handShake;

    public List<Signal> calculateHandshake(int decNum) {

        String binary = Integer.toBinaryString(decNum);
        handShake = new ArrayList<>();
        int i = 0;

        for (Signal s : Signal.values()) {
            if (binary.length() > i && binary.charAt(i) == '1') {
                handShake.add(s);
            }
            i++;
        }
        return handShake;
    }
}