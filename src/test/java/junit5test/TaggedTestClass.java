package junit5test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TaggedTestClass {


    @BeforeAll
    void beforeAll() {
        System.out.println("--This is a before ALL method--\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("----This is a before each method----\n");

    }

    @AfterAll
    void afterAll() {
        System.out.println("--This is a after ALL method--\n");

    }

    @AfterEach
    void afterEach() {
        System.out.println("----This is a after each method----\n");
    }

    @Test
    @Tag("sanity")
    void firstMethod() {
        System.out.println("This is my first method in Junit Learning\n");
    }

    @Test
    @Tag("sanity")
    @Tag("acceptance")
    @DisplayName("Example display name - Test2\n")
    void secondMethod() {
        System.out.println("This is a second test method\nFirstTestClassFirstTestClass");
    }

    @Test
    @Tag("acceptance")
    void thirdMethod() {
        System.out.println("This is a third method");
    }

    @Tag("acceptance")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1, 5, 6})
    void intValues(int params) {
        System.out.println("param = " + params);
    }
}
