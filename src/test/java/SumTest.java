import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumTest {
    //int a int b
    //1,4
    //-3,-10
    //0,0
    //0, -5
    //10, 0
    //-7,5
    //100,-4
    //1.7, 1.1
    //10 000 000, 5

    @ParameterizedTest
   @MethodSource("validData")
    void sumOfTwoNumbers(int a, int b, int expected) {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(a,b);
        int expectedSumValue = expected;
        assertEquals(expectedSumValue, actualSumValue);
    }

    static Stream<Arguments> validData(){
        return Stream.of(
                arguments(4, 1, 5),
                arguments(-3,-10, -13),
                arguments(0,0,0),
                arguments(0,-5,-5),
                arguments(10,0,10),
                arguments(-7,5,-2),
                arguments(100,-4,96),
                arguments(10000000,5, 10000005)
        );
    }




    @Test
    void sumOfTwoNumbersTwoNegative() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(-3,-10);
        int expectedSumValue = -13;
        assertEquals(expectedSumValue, actualSumValue);
    }
    @Test
    void sumOfTwoNumbersTwoZeroes() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(0,0);
        int expectedSumValue = 0;
        assertEquals(expectedSumValue, actualSumValue);
    }
    @Test
    void sumOfTwoNumbersZeroNegative() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(0,-5);
        int expectedSumValue = -5;
        assertEquals(expectedSumValue, actualSumValue);
    }
    @Test
    void sumOfTwoNumbersPositiveZero() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(10,0);
        int expectedSumValue = 10;
        assertEquals(expectedSumValue, actualSumValue);
    }
    @Test
    void sumOfTwoNumbersNegativePositive() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(-7,5);
        int expectedSumValue = -2;
        assertEquals(expectedSumValue, actualSumValue);
    }
    @Test
    void sumOfTwoNumbersPositiveNegative() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(100,-4);
        int expectedSumValue = 96;
        assertEquals(expectedSumValue, actualSumValue);
    }
    @Test
    void sumOfTwoNumbersFirstBig() {
        Sum sum = new Sum();
        int actualSumValue = sum.sumOfTwoNumbers(10000000,5);
        int expectedSumValue = 10000005;
        assertEquals(expectedSumValue, actualSumValue);
    }
}