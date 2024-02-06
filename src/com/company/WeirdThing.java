package com.company;

import java.lang.*;
import java.util.Iterator;

public class WeirdThing implements Iterable<String> {
    private String[] values = {"This", "is", "a", "test"};

    public int length()
    {
        return values.length;
    }

    public String getValue(int index)
    {
        return values[index];
    }

    public Iterator<String> iterator()
    {
        return new WeirdThingIterator( this );
    }
}

