
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Race race = new Race();  // Создаем объект гонки
        Car car;  // Объявляем переменную для автомобиля

        // Запрашиваем данные для трех автомобилей
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите данные для автомобиля " + i + ":");

            // Считываем название автомобиля
            System.out.print("Введите название автомобиля: ");
            String name = scanner.nextLine();

            // Считываем скорость автомобиля с проверкой
            int speed = 0;
            while (true) {
                System.out.print("Введите скорость автомобиля (0 < скорость <= 250): ");
                speed = scanner.nextInt();
                scanner.nextLine();  // Чтение лишнего символа новой строки
                if (speed > 0 && speed <= 250) {
                    break;  // Выход из цикла, если скорость корректна
                } else {
                    System.out.println("Неверное значение скорости. Попробуйте снова.");
                }
            }

            // Создаем объект автомобиля и определяем лидера
            car = new Car(name, speed);
            race.determineLeader(car);
        }

        // Выводим название лидера гонки
        System.out.println("Самая быстрая машина: " + race.getLeaderName());
    }
}

