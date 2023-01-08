package junit5test;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTestClass1 {


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
        System.out.println("This is a second test method\n");
    }

    @Test
    @DisplayName("Third display name - Test3\n")
    void thirdTest() {
        System.out.println("This is a third test method");
    }
}
