public class Main {
    public static void main(String[] args) {

        int currentaccount = 100;
        int payment = 1888;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        currentaccount = currentaccount + payment + bonus;

        System.out.println("Текущий счет:");
        System.out.println(currentaccount);
        System.out.println("Сумма бонусов:");
        System.out.println(bonus);
    }
}
