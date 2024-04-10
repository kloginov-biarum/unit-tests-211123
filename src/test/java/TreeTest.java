import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TreeTest {

   @ParameterizedTest
   @MethodSource("validData")
    void garlandLength(int[] arr, int result) {
        Tree tree = new Tree();
        int actualLength = tree.garlandLength(arr);
        int expectedLength = result;
        assertEquals(expectedLength, actualLength);
    }

    static Stream<Arguments> validData(){
        return Stream.of(
                arguments(new int[]{1,2,3,4,5}, 4),
                arguments(new int[]{1,4,2,3,5}, 8)
        );
    }

    //{1,2,3,4,5} 4
    //{1,4,2,3,5} 8

}