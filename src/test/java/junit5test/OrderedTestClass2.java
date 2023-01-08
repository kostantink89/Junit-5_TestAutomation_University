package junit5test;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTestClass2 {


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
    @Order(2)
    void firstMethod() {
        System.out.println("This is my first method in Junit Learning\n");
    }

    @Test
    @DisplayName("Example display name - Test2\n")
    void secondMethod() {
        System.out.println("This is a second test method\nFirstTestClassFirstTestClass");
    }

    @Test
    @Order(1)
    void thirdTestMethod() {
        System.out.println("This is a third test method,but first in order");

    }
}
