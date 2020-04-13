package com.company;

/**
 * This program demonstrates that an interface type may
 * be used to create a polymorphic reference.
 * Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */
public class PolymorphicInterfaceDemo {
    public static void main(String[] args) {
        CompactDisc cd = new CompactDisc("Greatest Hits",
                "Joe Looney Band",
                18.95);
        DvdMovie movie = new DvdMovie("Wheels of Fury",
                137, 12.95);

        System.out.println("Item #1: " + cd.getTitle());
        showPrice(cd);
        System.out.println();
        System.out.println("Item #2: " + movie.getTitle());
        showPrice(movie);
    }

    /**
     * showPrice method
     * In this static method, note the argument is a reference to a RetailItem.
     */
    // Note also that the following won't work!
    // RetailItem item = new RetailItem(); // ERROR!
    // As the hovertext on the above command shows, you cannot create an instance of an interface.
    private static void showPrice(RetailItem item) {
        // System.out.println(item.getTitle());
        System.out.print("Price: $");
        System.out.printf("%.2f", item.getRetailPrice());
        System.out.println();
        // An interface reference variable like item above can reference any object
        // that implements the interface, regardless of its class type, such as CompactDisc or DvdMovie.
        // When an interface variable references an object,
        // only the methods declared in the interface are available (here getRetailPrice).
        // Explicit type casting is required to access the other methods.
    }
}