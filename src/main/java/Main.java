
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Race race = new Race();  // Создаем объект гонки
        Car car;  // Объявляем переменную для автомобиля

        // Запрашиваем данные для трех автомобилей
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите данные для автомобиля " + i + ":");

            // Считываем название автомобиля с проверкой на пустое значение
            String name;
            while (true) {
                System.out.print("Введите название автомобиля: ");
                name = scanner.nextLine().trim();  // Убираем возможные пробелы в начале и в конце
                if (!name.isEmpty()) {
                    break;// Если имя не пустое, выходим из цикла
                } else {
                    System.out.println("Название не может быть пустым. Попробуйте снова");
                }
            }

            // Считываем скорость автомобиля с проверкой
            int speed;
            while (true) {
                System.out.print("Введите скорость автомобиля (0 < скорость <= 250): ");

                if (scanner.hasNextInt()) { // Проверка на введение числа
                    speed = scanner.nextInt();
                    scanner.nextLine();  // Чтение лишнего символа новой строки

                    if (speed > 0 && speed <= 250) {
                        break;  // Выход из цикла, если скорость корректна
                    } else {
                        System.out.println("Неверное значение скорости. Попробуйте снова.");
                    }
                } else {
                    System.out.println("Ввод некорректен! Введите целое число для скорости.");
                    scanner.nextLine();
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

