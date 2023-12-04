package coursework02;

import java.util.*;
class Paragraph
{
    private String text;
    private Map<Integer, String> options;

    public Paragraph(String text, boolean b)
    {
        this.text = text;
        this.options = new LinkedHashMap<>();
    }

    public void addOption(int number, String option)
    {
        options.put(number, option);
    }

    public String getText()
    {
        return text;
    }

    public Map<Integer, String> getOptions()
    {
        return options;
    }


    public boolean isEnd()
    {

        return false;
    }
}