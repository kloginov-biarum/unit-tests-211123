import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostTest {

    @Test
    void deliveryCostCalc() {
        Cost cost = new Cost();
        assertEquals(420,
                cost.deliveryCostCalc(5, true, false,"высокая"));
    }
}