package homework2;

public class num {
    public static void main(String[] args) {
        int fullNum = 45; //рандомное первое число
        int firstOperation = fullNum / 10; // делю число на 10
        int secondOperation = fullNum % 10; // нахожу остаток от деления исходного числа на 10
        int sumOfNum = firstOperation + secondOperation;
        System.out.println("сумма чисел двухзначного числа = " + sumOfNum);
    }
}
