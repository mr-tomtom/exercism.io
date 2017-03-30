import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class HandshakeCalculator {

    private List<Signal> handShake;

    public List<Signal> calculateHandshake(int decNum) {

        handShake = new ArrayList<>();

        for (Signal s : Signal.values()) {
            if ((decNum & 1) == 1) {
                handShake.add(s);
            }
            decNum = decNum >> 1;
        }
        if ((decNum & 1) == 1) Collections.reverse(handShake);
        return handShake;
    }
}