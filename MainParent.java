public class MainParent {
    public static void main(String[] args) {
        // Создание объекта со значениями-константами
        Name time1 = new Name(10, 30, 15);
        System.out.println("Time 1: " + time1);
        System.out.println("Total minutes: " + time1.calculateTotalMinutes());
        time1.decreaseTime(10);
        System.out.println("Time after decrease 10 minutes: " + time1);

        // Создание объекта со введенными значениями (для примера используем фиктивные значения)
        int hours = 15;
        int minutes = 45;
        int seconds = 5;

        Name time2 = new Name(hours, minutes, seconds);
        System.out.println("Time 2: " + time2);
        System.out.println("Total minutes: " + time2.calculateTotalMinutes());
        time2.decreaseTime(20);
        System.out.println("Time after decrease 20 minutes: " + time2);
    }
}
