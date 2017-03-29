import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class HandshakeCalculator {

    private List<Signal> handShake;

    public List<Signal> calculateHandshake(int decNum) {

        String binary = Integer.toBinaryString(decNum);
        int bLen = binary.length();
        handShake = new ArrayList<>();

        if (bLen < 1) {
            return Collections.emptyList();
        }
        if (bLen > 0 && binary.charAt(bLen-1) == '1') {
            handShake.add(Signal.WINK);
        }
        if (bLen > 1 && binary.charAt(bLen-2) == '1') {
            handShake.add(Signal.DOUBLE_BLINK);
        }
        if (bLen > 2 && binary.charAt(bLen-3) == '1') {
            handShake.add(Signal.CLOSE_YOUR_EYES);
        }
        if (bLen > 3 && binary.charAt(bLen-4) == '1') {
            handShake.add(Signal.JUMP);
        }
        if (bLen > 4 && binary.charAt(bLen-5) == '1') {
            Collections.reverse(handShake);
        }

        //test edits to see what happens doing a different branch in intelij
        
        return handShake;
    }






}

