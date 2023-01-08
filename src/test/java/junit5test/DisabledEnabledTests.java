package junit5test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DisabledEnabledTests {

    @Test
    @Disabled(value = "Disabled for demo of @Disabled")
    void firstTest() {
        System.out.println("This is a first test");
    }

    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled for demo of " + "@DisabledOnOs")
    void secondTest() {
        System.out.println("This is a second test");
    }

    @Test
    void thirdTest() {
        System.out.println("This is a third test");
    }

    @Test
    @DisabledIf(value = "provider", disabledReason = "Disabled for demo of @DisabledOf")
    void fourthTest() {
        System.out.println("This is a fourth test");
    }

    boolean provider() {
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }

    @Test
    void fifthTest() {
        System.out.println("This is a fifth test");
    }
}
