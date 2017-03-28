import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    LocalDateTime gigaSec;

    Gigasecond(LocalDate noTime) {
        gigaSec = noTime.atStartOfDay().plusSeconds(1000000000);
    }

    Gigasecond(LocalDateTime withTime) {
        gigaSec = withTime.plusSeconds(1000000000);
    }
    LocalDateTime getDate() {
        return gigaSec;
    }
}
