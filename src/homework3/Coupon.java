package homework3;

public class Coupon
{
    public static void main(String[] args)
    {
        int couponNumber = 1111; // Купон
        double resultSum = 100.0; // Сумма покупки

        switch (couponNumber) {
            case 1111:
                resultSum *= 0.9; // 10%
                break;
            case 3333:
                resultSum *= 0.8; // 20%
                break;
            case 5555:
                resultSum *= 0.7; // 30%
                break;
            default:
                // Без скидки
                break;
        }

        System.out.println("С вас " + resultSum);
    }
}
