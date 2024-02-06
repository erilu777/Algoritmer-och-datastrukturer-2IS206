package com.company;
import java.util.Iterator;

public class WeirdThingIterator<String> implements Iterator {
    private WeirdThing theThing;
    int cursor;

    public WeirdThingIterator(WeirdThing theThing)
    {
        this.theThing = theThing;
        cursor = 0;
    }

    // returns false if next element does not exist
    public boolean hasNext()
    {
        return cursor < theThing.length();
    }

    // return current data and update pointer
    public java.lang.String next()
    {
        java.lang.String value = theThing.getValue(cursor);
        cursor++;
        return value;
    }

    // implement if needed
    public void remove()
    {
    }
}
