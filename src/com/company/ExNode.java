package com.company;

/**
 * Ansvaret för denna klass är att hålla reda på en nod i listan,
 * d v s data som finns i noden samt var nästa nod finns någonstans
 */
public class ExNode {
    private String value;
    private ExNode nextNode;

    public ExNode(String initialValue)
    {
        this.value = initialValue;
        this.nextNode = null;
    }

    public String getValue()
    {
        return value;
    }

    public void setNextNode(ExNode node)
    {
        this.nextNode = node;
    }

    public ExNode getNextNode()
    {
        return nextNode;
    }
}
