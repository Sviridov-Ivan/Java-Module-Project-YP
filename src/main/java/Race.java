public class Race {
    String currentLeaderName = ""; // имя текущего лидера гонки

    int leaderDistance = 0; // дистанция

    // Метод для определения нового лидера
    public void determineLeader(Car car) {
        int carDistance = car.calculationDistance();


        if (carDistance > leaderDistance) { // Проверяем, если новый автомобиль проедет больше, обновляем лидера
            currentLeaderName = car.getName();
            leaderDistance = carDistance;
        }
    }
    // Метод для получения имени лидера
    public String getLeaderName() {

        return currentLeaderName;
    }
}
