package com.company.project.lessonexercise1516;

import java.util.Comparator;
public class User
{
    private String name;
    private int age;
    private int salary;



    public static class NameComparator implements  Comparator <User>
    {
        public int compare(User o1, User o2)
        {
            return o1.name.compareTo(o2.name);
            //return o1.name.length() - o2.name.length();
        }
    }
    public static class SalaryComparator implements Comparator <User>

    {
        public int compare(User o1, User o2)
        {
            //Integer.compare(o1.salary, o2.salary);
            return o1.salary - o2.salary;
        }
    }
}
