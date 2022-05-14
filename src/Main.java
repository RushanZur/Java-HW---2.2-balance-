public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int replenishment = 3000;

        int bonus = replenishment > 1000 ? replenishment / 100 : 0;
        balance += bonus + replenishment;

        System.out.println("Баланс " + balance + " рублей");
        System.out.println("Зачислено на счет " + replenishment + " рублей");
        System.out.println("Начислено " + bonus + " бонусов");
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
