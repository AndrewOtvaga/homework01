package com.company.project.lessonexercise1516;


import java.util.*;
public class Lesson1516
{
    public static void main(String[] args) {
        Set<String> strings01 = new HashSet<>(
                Arrays.asList("Саратов", "Новгород")
        );


        strings01.add("Тверь");
        strings01.add("Москва");

        LinkedList<String> strings = new LinkedList<>(strings01);
        //LinkedlIST - двунаправленный связанный список
        System.out.println(strings.size());

        strings.add("СПб");
        strings.add("Самара");
        strings.add(null);
        strings.remove("Самара");
        strings.remove(3);

        ArrayList<String> stringArrayList = new ArrayList<>(49);
        ArrayList<Integer> integers = new ArrayList<>();
        //arraylist- регулируемый массив
        System.out.println(integers.size());
        integers.add(3);
        integers.add(6);
        integers.add(90);
        integers.remove(3);

        //integers.add(null);

        //перебор коллекций
        //fori - для списков
        //foreach
        //iterator
        //вызов метола remove в циклах fori и foreach
        //приведёт к исключению ConcurrentModificationExcept


        for (var integer : integers) {
            System.out.println(integer);
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext())
        {
            String element = iterator.next();
            System.out.println(element.toUpperCase());
            if ("самара".equalsIgnoreCase(element))
            {
                iterator.remove();
            }
        }
        strings.removeIf(string -> string.equalsIgnoreCase("самара"));

        ArrayList<Vehicles> vehiclesList = new ArrayList<>();
        for (Vehicles jokendingSkuf : vehiclesList)
        {

        }
        //List: ArrayList, LinkedList
        // 1. возможность работы с индексами
        // 2. элементы хранятся в порядке добавления
        // 3. можно добавить null
        // 4/ могут содержать дублирующие элементы

        //

        // Set:
        // 1. не позволяет хранить дублирующиеся элементы
        // 2. возможность добавить null и порядок хранения
        // зависят от конкретной реализации

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(4);
        integerHashSet.add(6);
        integerHashSet.add(4);
        integerHashSet.add(7);
        integerHashSet.add(70);
        integerHashSet.add(145);
        //integerHashSet.add(null); позвоялет добавить null
        System.out.println(integerHashSet);

        Comparator<User> byName = new User.NameComparator();
        Comparator<User> bySalary = new User.SalaryComparator();

        Comparator<User> byNameThenBySalary = byName
                .thenComparing(bySalary);
                //.thenComparing(byBirth);

        TreeSet<User> users01 = new TreeSet<>(byNameThenBySalary);
        TreeSet<User> users02 = new TreeSet<>(byName);

    }
}

