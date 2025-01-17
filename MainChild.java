public class MainChild {
    public static void main(String[] args) {
        // Создание объекта класса-родителя
        Name time = new Name(10, 30, 45);
        System.out.println("Parent class object: " + time);

        // Создание объекта класса-потомка
        ChildName childTime1 = new ChildName(5, 15, 20, "Operator A");
        System.out.println("Child class object 1: " + childTime1);

        ChildName childTime2 = new ChildName(12, 0, 0, "Operator B");
        System.out.println("Child class object 2: " + childTime2);

    }
}
