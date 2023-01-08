package junit5test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledEnabledTests {

    @Test
    @Disabled(value = "Disabled for demo of @Disabled")
    void firstTest() {
        System.out.println("This is a first test");
    }

    @Test
    void secondTest() {
        System.out.println("This is a second test");
    }

    @Test
    void thirdTest() {
        System.out.println("This is a third test");
    }

    @Test
    void fourthTest() {
        System.out.println("This is a fourth test");
    }

    @Test
    void fifthTest() {
        System.out.println("This is a fifth test");
    }
}
