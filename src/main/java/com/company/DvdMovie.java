package com.company;

/**
 *  DvdMovie class
 *  Starting Out with Java by Gaddis
 *  Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */

public class DvdMovie implements RetailItem
{
   private String title;       // The DVD's title
   private int runningTime;    // Running time in minutes
   private double retailPrice; // The DVD's retail price
   
   /**
    *  Constructor
    */

   public DvdMovie(String title, int runningTime, double retailPrice)
   {
      this.title = title;
      this.runningTime = runningTime;
      this.retailPrice = retailPrice;
   }
   
   /**
    *  getTitle method
    */
   public String getTitle()
   {
      return title;
   }
   
   /**
    *  getRunningTime method  
    */
   public int getRunningTime()
   {
      return runningTime;
   }

   /**
    *  getRetailPrice method (Required by the RetailItem  
    *  interface)
    */
   public double getRetailPrice()
   {
      return retailPrice;
   }
}