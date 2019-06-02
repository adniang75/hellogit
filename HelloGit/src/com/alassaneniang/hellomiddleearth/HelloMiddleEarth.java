package com.alassaneniang.hellomiddleearth;

public class HelloMiddleEarth {

    public static void main( String[] args ) {

        String[] names = { "Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf" };

        // print greetings
        for ( String name : names ) {
            System.out.format( "Hello, %s!%n", name );
            System.out.println( "How are you doing?" );
        }

    }

}
