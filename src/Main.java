public class Main {
    public static void main (String [] args) {
        int ticket = 6559; // Стоимость билета в рублях
        int mile = 20; // Рублей в 1 бонусной миле
        int bonus = ticket / mile; // Бонусных миль можно получить
        System.out.println("Бесплатные мили за перелёты: " + bonus);

    }
}
