package junit5test;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParameterizedTests {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1, 5, 6})
    void intValues(int params) {
        System.out.println("param = " + params);
    }

    @ParameterizedTest()
    @NullAndEmptySource()
    @ValueSource(strings = {"firstString", "secondString"})
    void stringVales(String parameter) {
        System.out.println("The parameter is " + parameter);

    }

    @ParameterizedTest
    @CsvSource(value = {"steve,rogers", "black,adam", "fantastic,four"})
    void csvSource_StringString(String param1, String param2) {
        System.out.println("Parameter1 = " + param1 + "\nParameter2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"bruce,44,true", "alpha,101,false", "andy,22,true"})
    void csvSource_StringIntBoolean(String param1, int param2, boolean param3) {
        System.out.println("Parameter1 = " + param1 + "\nParameter2 = " + param2 + "\nParameter3 = " + param3);
    }

    @ParameterizedTest
    @CsvSource(value = {"captain america,'steve,rogers'", "winter soldier,'bucky,barnes'"})
    void csvSource_StringWithComma(String param1, String param2) {
        System.out.println("Parameter1 = " + param1 + "\nParameter2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve?rogers", "john?mclain"}, delimiter = '?')
    void csvSource_StringWithDifferentDelimiters(String param1, String param2) {
        System.out.println("Parameter1 = " + param1 + "\nParameter2 = " + param2);

    }

    @ParameterizedTest
    @CsvFileSource(files = {"src/test/resources/params/shoppinglist.csv", "src/test/resources/params/shoppinglist2.csv"},
            numLinesToSkip = 1)
    void csvFileSource_StringDoubleIntStringString(String name, double price, int quantity, String unitOfMeasure,
                                                   String provider) {
        System.out.println("Name = " + name + "\nPrice = " + price + "\nQuantity = " + quantity + "\nUnit of Measure = " +
                unitOfMeasure + "\nProvider = " + provider);


    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/params/shoppinglist3.csv",
            numLinesToSkip = 1, delimiterString = "___")
    void csvFileSource_SpecifyDelimiter(String name, double price, int quantity, String unitOfMeasure,
                                        String provider) {
        System.out.println("Name = " + name + "\nPrice = " + price + "\nQuantity = " + quantity + "\nUnit of Measure = " +
                unitOfMeasure + "\nProvider = " + provider);


    }

    @ParameterizedTest
    @MethodSource(value = "sourceString")
    void methodSource_String(String param1) {
        System.out.println("Parameter1 = " + param1);

    }

    List<String> sourceString() {
        //processing done here
        return Arrays.asList("tomato", "cabbage", "carrot");
    }

    @ParameterizedTest
    @MethodSource(value = "sourceStringStream")
    void methodStringStream(String param1) {
        System.out.println("Parameter1 = " + param1);
    }

    Stream<String> sourceStringStream() {
        return Stream.of("apple", "banana", "pineapple");
    }


    @ParameterizedTest
    @MethodSource(value = "sourceListStringAndDouble")
    void method_SourceListStringAndDouble(String param1, double param2) {
        System.out.println("Parameter1 = " + param1 + "\nParameter2 = " + param2);
    }

    List<Arguments> sourceListStringAndDouble() {
        return Arrays.asList(arguments("anana", 3.5), arguments("coffee", 5.3),
                arguments("chocolate", 2.75));
    }

    @ParameterizedTest
    @MethodSource(value = "junit5test.ParamProvider#sourceStreamStringAndDouble")
    void method_sourceStreamStringAndDouble(String param1, double param2) {
        System.out.println("Parameter1 = " + param1 + "\nParameter2 = " + param2);
    }


}
