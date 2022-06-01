public class LessonFourBasicOperations {

    public static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {

        System.out.println("===============My variables:");
        char aCharOne = 'q';
        char aCharTwo = 122;  // символ, записанный числовым значением
        System.out.println(aCharOne);
        System.out.println(aCharTwo);

        byte aByteOne = (byte) (Byte.MAX_VALUE + 2);
        System.out.println(aByteOne);
        byte aByteTwo = (byte) (Byte.MIN_VALUE - 2);
        System.out.println(aByteTwo);

        // byte aByteThree = 130; - переполнение значения
        // byte aByteFour = -150; - переполнение значения

        short aShort = 5555;
        int aInt = 10000;

        //short + integer
        System.out.println("Short + Int = " + (aShort + aInt));

        long aLong = 333L;
        System.out.println(aInt - aLong);

        float salary = 33_333.5F;
        double tax = 333.5d;
        String money = "===============My own money = ";

        // вывод с параметрами и двумя числами после запятой
        System.out.printf("%s %.2f", money, salary - tax);
        System.out.println();

        int myIncome = 30_000;
        System.out.printf("My income = %d\n", myIncome);
        int myBills = 20_000;
        System.out.printf("My bills = %d\n", myBills);

        boolean isMoneyEnough = myIncome > myBills;

        if (isMoneyEnough) {
            System.out.println("I will survive! ! !");
        } else {
            System.out.println("Wake up and get more money!");
        }

        int annualIncome = 360_000;
        int monthlyBills = 25_000;
        int monthsOfLiving = annualIncome / monthlyBills;
        int annualRestMoney = annualIncome % (monthlyBills * MONTHS_IN_YEAR);

        System.out.printf("I can live %d months with my annual income \n", monthsOfLiving);
        System.out.printf("Or I can keep %d rubles every year \n", annualRestMoney);

        int[] list = new int[3];
        list[0] = 3000;
        list[1] = 5000;
        list[2] = 7000;

        System.out.println("================For loop");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
