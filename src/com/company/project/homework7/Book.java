package com.company.project.homework7;

public class Book
{
    private String name;
    private boolean isPublished;
    private Author[] authors;

    public Book(String name, int numberOfAuthors)
    {
        setName(name);
        setNumberOfAuthors(numberOfAuthors);
    }

    public void setName(String name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setNumberOfAuthors(int numberOfAuthors)
    {
        if (numberOfAuthors < 1 || numberOfAuthors >= 5)
        {
            throw new IllegalArgumentException("numberOfAuthors must be in the range [1, 5)");
        }
        authors = new Author[numberOfAuthors];
    }

    public int getNumberOfAuthors()
    {
        return authors.length;
    }

    public void addAuthor(Author author)
    {
        if (author == null)
        {
            throw new IllegalArgumentException("Author cannot be null");
        }


        for (int i = 0; i < authors.length; i++)
        {
            if (authors[i] != null && authors[i].equals(author))
            {
                return; // Author already exists, no need to add
            }
        }


        for (int i = 0; i < authors.length; i++)
        {
            if (authors[i] == null)
            {
                authors[i] = author;
                return; // Author successfully added
            }
        }

        throw new IllegalStateException("Cannot add author, array is full");
    }
}
