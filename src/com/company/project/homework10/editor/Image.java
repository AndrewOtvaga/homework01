package com.company.project.homework10.editor;

public class Image implements Drawable {
    private String path;

    public Image(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public void draw() {
        System.out.println(path);
    }

    @Override
    public Image clone() {
        return new Image(path);
    }
}