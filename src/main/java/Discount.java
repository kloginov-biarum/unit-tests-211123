public class Discount {
//на каждую вторую покупку в чеке - скидка 2%
//после 18:00 +2%
//int i - номер покупки в чеке (1, 13, 25, 2)
//int after18 (0, 1) - после 18 или нет


    //5,0   - 0
    //7,1   - 2
    //4,0   - 2
    //8,1   - 4

    public int discountCalc(int i, int after18){
        int discount = 0;
        //Calculation logic
        if (i % 2 == 0) {
            discount += 2;
        }
        if (after18 == 1) {
            discount += 2;
        }
        return discount;
    }
    public int discountCalc2(int i, int after18) {
        int discount = 0;
        if (i % 2 != 0 && after18 == 0) {
            discount = 0;
        }
        if (i % 2 == 0 && after18 == 1) {
            discount += 4;
        }
        if (i % 2 == 0 && after18 == 0 || i % 2 != 0 && after18 == 1) {
            discount += 2;
        }

        return discount;
    }
}
