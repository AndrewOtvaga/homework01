package com.company.project.homework20;

public class task02
{
/*1. Метод teeing:
Метод teeing позволяет объединить результаты двух коллекторов с помощью функции и получить итоговый результат. Функция должна принимать два аргумента и возвращать результат.
    Пример:

    List<Integer> numbers = List.of(1, 2, 3, 4, 5);
    Double average = numbers.stream()
            .collect(Collectors.teeing(
                    Collectors.summingInt(i -> i),
                    Collectors.counting(),
                    (sum, count) -> (double) sum / count
            ));
System.out.println(average); // Output: 3.0

//2. Метод flatMapping:
//Метод flatMapping позволяет применить функцию к каждому элементу стрима и затем объединить результаты в один стрим. Этот метод полезен, когда функция возвращает стрим из каждого элемента.


List<String> words = List.of("Hello", "World");
List<Character> uniqueLetters = words.stream()
    .collect(Collectors.flatMapping(
        word -> word.chars().distinct().mapToObj(ch -> (char) ch),
        Collectors.toList()
    ));
System.out.println(uniqueLetters); // Output: [H, e, l, o, W, r, d]

//3. Метод joining:
//Метод joining используется для объединения элементов стрима в одну строку. Можно указать разделитель, который будет вставлен между элементами.

List<String> fruits = List.of("Apple", "Banana", "Orange");
String joinedFruits = fruits.stream()
    .collect(Collectors.joining(", "));
System.out.println(joinedFruits); // Output: Apple, Banana, Orange

//4. Метод summarizingDouble:
//Метод summarizingDouble возвращает объект DoubleSummaryStatistics, который содержит информацию о количестве элементов, их сумме, среднем значении, минимальном и максимальном значении.

    List<Double> numbers = List.of(1.5, 2.3, 3.7, 4.1, 5.9);
DoubleSummaryStatistics statistics = numbers.stream()
    .collect(Collectors.summarizingDouble(num -> num));
System.out.println(statistics); // Output: DoubleSummaryStatistics{count=5, sum=17.5, min=1.5, average=3.5, max=5.9}

//5. Метод averagingDouble:
//Метод averagingDouble возвращает среднее значение элементов стрима в виде double.

 List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        double average = numbers.stream()
                .collect(Collectors.averagingDouble(num -> num));

        System.out.println(average); // Output: 6.0

//6. Методы minBy и maxBy:
//Методы minBy и maxBy используются для нахождения минимального и максимального значения элементов стрима соответственно. Необходимо указать компаратор для сравнения элементов.

List<String> words = List.of("Apple", "Banana", "Orange");
Optional<String> shortestWord = words.stream()
    .collect(Collectors.minBy(Comparator.comparingInt(String::length)));
System.out.println(shortestWord); // Output: Optional[Apple]

//7. Метод reducing:
//Метод reducing позволяет выполнять свертку элементов стрима с помощью заданной функции. Метод принимает начальное значение и функцию, которая принимает два аргумента и возвращает результат.

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int sum = numbers.stream()
    .collect(Collectors.reducing(0, (a, b) -> a + b));
System.out.println(sum); // Output: 15

*/
}
