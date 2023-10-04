package homework2;

public class speed {
    public static void main(String[] args) {
        int time = 2; //задал время
        int kilometers = 50; //общее количество километров
        int speed = kilometers / time * 1000 / 3600; //формула для первода из школы
        System.out.println(speed + " метров в секунду");
    }
}
