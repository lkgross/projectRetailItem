package com.company;

/**
 *  Compact Disc class
 *  Starting Out with Java by Gaddis
 *  Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */
public class CompactDisc implements RetailItem
{
   private String title;       // The CD's title
   private String artist;      // The CD's artist
   private double retailPrice; // The CD's retail price
   
   /**
    *  Constructor
    */
   public CompactDisc(String title, String artist, double retailPrice)
   {
      this.title = title;
      this.artist = artist;
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
    *  getArtist method 
    */
   public String getArtist()
   {
      return artist;
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