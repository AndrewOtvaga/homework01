package com.company.project.homework20;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Task01
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Sex.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Sex.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Sex.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Sex.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Sex.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Sex.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Sex.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Sex.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Sex.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Sex.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Sex.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Sex.FEMALE, LocalDate.now().minusYears(6))
        ));
        // 1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Sex, ArrayList<Student>>

        //2. Средний возраст учеников
        double averageAge = students.stream()
                .collect(Collectors.averagingInt(student -> student.getBirth().until(LocalDate.now()).getYears()));;
        //3. Младший ученик
        Optional<Student> youngestStudent = students.stream()
                .min(Comparator.comparing(Student::getBirth));
        //4. Год рождения
        Map<Integer, List<Student>> studentsByBirthYear = students.stream()
                .collect(Collectors.groupingBy(student -> student.getBirth().getYear()));
        //5. Сортировка
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparing(Student::getSex)
                        .thenComparing(Student::getBirth)
                        .thenComparing(Student::getName, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        //6. Петр
        String someName = "Петр";
        List<Student> studentsWithName = students.stream()
                .filter(student -> student.getName().equals(someName))
                .collect(Collectors.toList());
        //7. Мапа
        Map<Student.Sex, Integer> sexIntegerMap = students.stream()
                .collect(Collectors.groupingBy(Student::getSex, Collectors.summingInt(student -> student.getBirth().until(LocalDate.now()).getYears())));

    }


}