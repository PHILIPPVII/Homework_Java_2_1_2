public class Two {
    public static void main(String[] args) {
        int addMoney = 100;
        int bonus = addMoney / 100;
        int balance = 100 + addMoney + bonus;
        if (balance > 1000)
            System.out.println("Поздравляем вам начислены бонусы в размере:" + bonus + "балл");
        else {
            System.out.println("Пополнен баланс на сумму:" + addMoney + "рублей");
        }
        System.out.println("Ваш итоговый баланс равен:" + balance );
    }
}