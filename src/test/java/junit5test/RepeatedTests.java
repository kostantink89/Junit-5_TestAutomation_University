package junit5test;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTests {


    @RepeatedTest(6)
    void firstRepeatedMethod() {
        System.out.println("Repeating this test");
    }

    @RepeatedTest(value = 3, name = "Running repetition: {currentRepetition}." + "Total is: {totalRepetitions}")
    @DisplayName("This is a repeated test method")
    void secondRepeatedMethod() {
        System.out.println("Repeating a new test");
    }

    @RepeatedTest(3)
    void thirdRepeatedMethod(RepetitionInfo repetitionInfo) {
        System.out.println("This code will run at each repetition");
        Assumptions.assumingThat(repetitionInfo.getCurrentRepetition() == 3,
                () -> System.out.println("This code only runs for repetition 3"));

    }
}
