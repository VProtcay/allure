import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Locale;

public class DataGenerator {

    private DataGenerator() {
    }

    public static class Registration {
        private Registration() {
        }

        public static Meeting generate() {
            Faker faker = new Faker(new Locale("ru"));
            LocalDate futureDateFirstMeeting = LocalDate.now().plusDays(5);
            LocalDate futureDateSecondMeeting = LocalDate.now().plusDays(7);

            return new Meeting(
                    faker.address().city(),
                    futureDateFirstMeeting,
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.phoneNumber().cellPhone(),
                    futureDateSecondMeeting);
        }
    }
}
