package com.company;

import java.util.*;

// https://www.geeksforgeeks.org/enumeration-vs-iterator-vs-listiterator-in-java/?ref=rp

/**
 * För att vår list-klass skall bli 'iterable' måste vi implementera
 * en särskild Iterator-klass som har inbyggd logik för att stega
 * igenom listans element.
 * @param <String>
 */
public class ExLinkedListIterator<String> implements Iterator { // Implementerar Iterator-interfacet
    ExNode current;
    ExNode previous;
    ExLinkedList theList;

    /**
     * Konstruktorn tar emot en referens tll list-objektet iteratorn skall iterera igenom
     * @param theList
     */
    public ExLinkedListIterator(ExLinkedList theList)
    {
        this.theList = theList;             // Spar undan referens till list-objektet i instansvariabeln
        current = theList.getStartNode();   // current talar om var i listan vi skall hämta nästa värde
    }

    /**
     * Funktion som talar om ifall det finns fler element att stega igenom
     * @return true om det finns fler element
     */
    public boolean hasNext()
    {
        return current != null;             // När current==null finns inga fler element att stega igenom
    }

    /**
     * Hämta nästa värde i listan
     * @return en text (String) med nästa värde i listan
     */
    public java.lang.String next()
    {
        java.lang.String value = current.getValue();    // Hämta nästa värde
        previous = current;
        current = current.getNextNode();    // Låt current hänvisa till nästa nod i listan
        return value;
    }

    /**
     * En Iterator kan också ta bort element i listan. Det är av denna anledning vi hela tiden
     * minns föregående nod i iterationen, ifall vi vill "länka bort" den aktuella noden.
     */
    public void remove()
    {
        if(current == null)         // Nothing to delete
            return;
        if(previous == null)        // Deleting the first element in the list
            theList.setStartNode(current.getNextNode());
        else                        // Delete a node somewhere else in the list
            previous.setNextNode(current.getNextNode());
    }
}
