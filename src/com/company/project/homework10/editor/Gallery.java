package com.company.project.homework10.editor;

public class Gallery implements Drawable
{
    private String name;
    private Drawable[] drawables;

    public Gallery(String name, Drawable[] drawables)
    {
        this.drawables = drawables;
        this.name = name;
    }

    public Drawable[] getImages() {
        return drawables;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void draw()
    {
        System.out.println(name);
        for (Drawable drawable : drawables)
        {
            drawable.draw();
        }
    }

    @Override
    public Gallery clone()
    {
        Drawable[] clonedDrawables = new Drawable[drawables.length];

        for (int i = 0; i < drawables.length; i++)
        {
            clonedDrawables[i] = drawables[i].clone();
        }

        return new Gallery(name, clonedDrawables);
    }
}