package junit5test;

import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTestClass {


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
    void firstMethod() {
        System.out.println("This is my first method in Junit Learning\n");
    }

    @Test
    @DisplayName("Example display name - Test2\n")
    void secondMethod() {
        System.out.println("This is a second test method\nFirstTestClassFirstTestClass");
    }
}
