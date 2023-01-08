package junit5test;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionTests {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1, 5, 6})
    void intValues(int params) {
        assumeTrue(params > 4);
        System.out.println("param = " + params);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve,rogers", "black,adam", "fantastic,four"})
    void csvSource_StringString(String param1, String param2) {
        assumeFalse(param1.equals("steve"), "Assumption failed for the following parameter");
        System.out.println("Parameter1 = " + param1 + "\nParameter2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"bruce,44,true", "alpha,101,false", "andy,5,true"})
    void csvSource_StringIntBoolean(String param1, int param2, boolean param3) {
        assumingThat(param2 > 20, () -> System.out.println("This code ran"));
        System.out.println("Parameter1 = " + param1 + "\nParameter2 = " + param2 + "\nParameter3 = " + param3);
    }
}
