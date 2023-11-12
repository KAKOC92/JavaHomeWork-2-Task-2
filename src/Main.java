public class Main {
    public static void main(String[] args) {
        int startBalance = 100; //Начальный баланс клиента
        int depositAmount = 1100; // Сумма пополнения
        int finalBalance = startBalance + depositAmount; // Итоговый баланс

        //int bonusRub;
        //if (depositAmount > 1000) {
        //    bonusRub = depositAmount / 100;
        //} else {
        //    bonusRub = 0;
        //}
        int bonusRub = depositAmount > 1000 ? depositAmount / 100 : 0;
        System.out.println("Итоговый баланс: " + (finalBalance + bonusRub));
        System.out.println("Бонусных рублей: " + bonusRub);
    }
}
