import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DiscountTest {

    //5,0   - 0
    //7,1   - 2
    //4,0   - 2
    //8,1   - 4
    @Test
    void discountCalcOddNotAfter18() {
        Discount discount = new Discount();
        assertEquals(0, discount.discountCalc(5,0));
    }
    @Test
    void discountCalcOddAfter18() {
        Discount discount = new Discount();
        assertEquals(2, discount.discountCalc(7,1));
    }
    @Test
    void discountCalcEvenNotAfter18() {
        Discount discount = new Discount();
        assertEquals(2, discount.discountCalc(4,0));
    }
    @Test
    void discountCalcEvenAfter18() {
        Discount discount = new Discount();
        assertEquals(4, discount.discountCalc(8,1));
    }


  @ParameterizedTest
  @MethodSource("validData")
    void discountCalcTest(int discountValue, int purchaseNumber, int after18) {
        Discount discount = new Discount();
        assertEquals(discountValue, discount.discountCalc(purchaseNumber,after18));
    }

    static Stream<Arguments> validData(){
        return Stream.of(
                arguments(0, 5, 0),
                arguments(2, 7, 1),
                arguments(2, 4, 0),
                arguments(4, 8, 1)
        );
    }


}