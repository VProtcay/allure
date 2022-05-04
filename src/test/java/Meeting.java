import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Meeting {
    private final String city;
    private final LocalDate dateFirstMeeting;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final LocalDate dateSecondMeeting;
}
