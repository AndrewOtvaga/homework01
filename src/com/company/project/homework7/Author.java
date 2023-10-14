package com.company.project.homework7;

public class Author
{
    public long id;

    public String name;

    public Author(long authorId)
    {
        this.id = authorId;
    }

    public Author(){}
    public Author(long authorId, String name)
    {
        this(authorId);
        this.name = name;
    }
    public void printInfo()
    {

        System.out.print("Автор: id= " + id + ", name =" + name);
    }
    public String getInfo()
    {

        return  "Автор: id = " + id + ", name = " + name;
    }
    public void getInfo(String prefix)
    {

        if (prefix == null) return;
    }
}
