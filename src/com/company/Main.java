package com.company;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ExLinkedList myList = new ExLinkedList();

        myList.insertSorted("Sedin");           // Test av att sätta in i tom lista
        myList.insertSorted("Zetterberg");      // Ytterligare test sist i listan
        myList.insertSorted("Sundin");          // Test att sätta in mellan två noder
        myList.insertSorted("Forsberg");        // Testa att sätta in först i listan

        //myList.print();

        //myList.remove("Sundin");

        // Eftersom denna version av vår länkade lista implementerar Iterable-interfacet
        // kan vi även stega igenom den med nedanstående kod
        Iterator tmp = myList.iterator();
        while(tmp.hasNext())
        {
            String value = (String)tmp.next();
            System.out.println(value);
        }

        // Eftersom denna version av vår länkade lista implementerar Iterable-interfacet
        // kan vi även stega igenom den med nedanstående (förenklade) kod - det är en feature
        // i Java att erbjuda nedanstående smidiga syntax för att loopa sig fram när en klass implementerar
        // interfacet Iterable
        for(String S: myList)
        {
            System.out.println(S);
        }

        // Vi skapade också ett iterable-interface för den skumma exempelklassen WeirdThing
        WeirdThing aThing = new WeirdThing();

        for(String S: aThing)
        {
            System.out.println(S);
        }
    }
}


