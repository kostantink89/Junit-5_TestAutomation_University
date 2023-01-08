package junit5test;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamProvider {

    static Stream<Arguments> sourceStreamStringAndDouble() {
        return Stream.of(arguments("snickers", 0.85), arguments("mars", 1.25));
    }
}
