public class Car {
    String name; // наименование автомобиля
    int speed; // скорость автомобиля

    // Конструктор класса "Автомобиль"
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public String getName() {
        return name;
    }

    // Метод для вычисления дистанции, которую автомобиль может проехать за 24 часа
    public int calculationDistance() {
        return speed * 24;  // время (24 часа) * скорость (км/ч)
    }
}

