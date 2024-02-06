package com.company;

import java.util.Iterator;

/**
 * Ansvaret för denna klass är
 * att hålla reda på var listans första nod finns
 * samt att tillhandahålla operationer på hela listan,
 * t ex sätta in  nya noder, söka en nod, ta bort en nod,
 * et cetera
 */
public class ExLinkedList implements Iterable<String> { // OBS! Implementerar interfacet Iterable
    private ExNode startNode;

    // Scenario a: vi har listan "Forsberg" --> "Sedin" --> "Sundin" och "Sedin" ska bort
    // Scenario b: vi har listan "Forsberg" --> "Sedin" --> "Sundin" och "Forsberg" ska bort
    // Scenario c: vi har listan "Forsberg" --> "Sedin" --> "Sundin" och "Sundin" ska bort

    public void remove(String value)
    {
        // 1. Leta rätt på rätt nod att ta bort

        ExNode temp = startNode;
        ExNode previous = null;

        // Sök till slutet av listan
        while(temp != null) {
             if( value.equals( temp.getValue() ) ) {
                 // temp hänvisar nu till den nod som ska tas bort
                 if( temp != startNode ) {
                     previous.setNextNode( temp.getNextNode() ); // Scenario a och c
                     return;
                 }
                 else {
                     startNode = temp.getNextNode(); // Scenario b
                     return;
                 }
             }
             else {
                 previous = temp;
                 temp = temp.getNextNode();
             }
        }
    }

    /**
     * Sätter in en ny nod först i listan
     * @param value
     */
    public void insert(String value)
    {
        // 1. Skapa den nya noden
        ExNode newNode = new ExNode(value);
        // 2. Länka in den nya noden först i listan
        newNode.setNextNode(startNode);
        startNode = newNode;
    }

    /**
     * Sätter in en nod på rätt plats i listan
     * (sorterat i bokstavsordning)
     * @param value
     */
    public void insertSorted(String value)
    {
        // Möjlighet a: Listan är tom
        if(startNode == null) {
            insert(value);
            return;
        }

        // 1. Skapa den nya noden
        ExNode newNode = new ExNode(value);

        // 2. Leta efter rätt plats och länka in nya noden
        ExNode temp = startNode;
        ExNode previous = null;
        boolean foundPosition = false;

        while(!foundPosition)
        {
            if(value.compareTo(temp.getValue()) < 0)
            {
                // Nu vet vi att den nya noden ska in före noden vi jämför med
                if(temp==startNode)
                {
                    // Möjlighet b: den nya noden ska in först i listan
                    newNode.setNextNode(startNode);
                    startNode = newNode;
                }
                else {
                    // Möjlighet c: den nya noden ska in mellan två noder
                    previous.setNextNode(newNode);
                    newNode.setNextNode(temp);
                }
                foundPosition = true;
            }
            else
            {
                previous = temp;
                temp = temp.getNextNode();
                if(temp == null) {
                    // Möjlighet d: Den nya noden ska in sist i listan
                    previous.setNextNode(newNode);
                    foundPosition = true;
                }
            }
        }

        // "Sedin" --> "Sundin"   sätt in "Zetterberg"
        // Listan ska bli "Sedin" --> "Sundin" --> "Zetterberg"
        // (ändra nextNode i "Sundin" och nya nodens nextNode ska vara null)

        // "Sedin" --> "Sundin"   sätt in "Forsberg"
        // Listan ska bli "Forsberg" --> "Sedin" --> "Sundin"
        // (ändra startnoden i listan)

        // "Forsberg" -->  "Sundin"     sätt in "Sedin"
        // Listan ska bli "Forsberg" --> "Sedin" --> "Sundin"
        // (Ändra nextNode i "Forsberg" och nya nodens nextNode ska vara "Sundin")
    }

    /**
     * Skriver ut alla noder i listan
     */
    public void print()
    {
        ExNode temp = startNode;

        while(temp != null) {
            System.out.println( temp.getValue() );
            temp = temp.getNextNode();
        }
    }

    /**
     *
     */
    public ExNode getStartNode()
    {
        return startNode;
    }

    public void setStartNode(ExNode startNode)
    {
        this.startNode = startNode;
    }

    /**
     * Implementering av funktionen iterator():
     * Eftersom denna klass implementerar interfacet Iterable _måste_
     * denna funktion implementeras. Det vi i princip säger när vi
     * säger att denna klass implementerar Iterable-interfacet är att
     * den har implementerat alla de funktioner som definieras i interfacet.
     * Kompilatorn förväntar sig därmed att vi ska implementera funktionen
     * iterator() i denna klass, då den är definierad i interfacet.
     */
    public Iterator<String> iterator()
    {
        return new ExLinkedListIterator(this);
    }
}
