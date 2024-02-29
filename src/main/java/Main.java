public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount1 = 1000;
        boolean registered1 = true;

        // Вызываем метод calculate для первого теста:
        long bonus1 = service.calculate(amount1, registered1);

        // Выводим результаты для первого теста:
        System.out.println("Bonus for registered and under limit: " + bonus1);

        // Подготавливаем данные для теста 2:
        long amount2 = 1_000_000;
        boolean registered2 = true;

        // Вызываем метод calculate для второго теста:
        long bonus2 = service.calculate(amount2, registered2);

        // Выводим результаты для второго теста:
        System.out.println("Bonus for registered and over limit: " + bonus2);
    }
}