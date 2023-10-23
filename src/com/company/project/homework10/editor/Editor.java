package com.company.project.homework10.editor;

public final class Editor implements Cloneable
{
    private Drawable drawable;

    public Editor(Drawable drawable) { // конструктор
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable){
        this.drawable = drawable;
    }

    public void show(){
        drawable.draw();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Editor cloned = (Editor) super.clone();
        if(this.drawable instanceof Gallery) {
            Drawable[] drawables = ((Gallery) this.drawable).getImages();
            Drawable[] clonedDrawables = new Drawable[drawables.length];
            for (int i = 0; i < drawables.length; i++) {
                // assuming that Image class also overrides clone()
                clonedDrawables[i] = (Drawable) ((Image) drawables[i]).clone();
            }
            cloned.setDrawable(new Gallery(((Gallery)this.drawable).getName(), clonedDrawables));
        }
        else if(this.drawable instanceof Image) {
            // assuming that Image class also overrides clone()
            cloned.setDrawable((Drawable) ((Image)this.drawable).clone());
        }
        return cloned;
    }
}