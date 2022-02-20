/**
 * An ordered pair contains x and y coordinates that can be found in a quadrant
 * or on an axis of the coordinate plane.
 */
   public class OrderedPair {
   // instance variables
   private double xCoordinate = 0.0;
   private double yCoordinate = 0.0;
   
   /**
    * Constructs an OrderedPair object initializing instance variables to non-default values.
    * 
    * @param anXCoordinate  the location relative to the x-axis
    * @param aYCoordinate   the location relative to the y-axis
    */
   public OrderedPair(double xCoordinate, double yCoordinate) {
     this.xCoordinate = xCoordinate;
     this.yCoordinate = yCoordinate;
   }
   
   /**
    * Returns the x-coordinate.
    * 
    * @return  the x-coordianate
    */
   public double getXCoordinate() {
     return xCoordinate;
   }
   
   /**
    * Sets the x-coordinate to param.
    * 
    * @param anXCoordinate  the new value of the x-coordianate
    */
   public void setXCoordinate(double xCoordinate) {
     this.xCoordinate = xCoordinate;
   }
   
   /**
    * Returns the y-coordinate.
    * 
    * @return  the y-coordianate
    */
   public double getYCoordinate() {
     return yCoordinate;
   }
   
   /**
    * Sets the y-coordinate to param.
    * 
    * @param anXCoordinate  the new value of the y-coordianate
    */
   public void setYCoordinate(double yCoordinate) {
     this.yCoordinate = yCoordinate;
   }
   
   /** 
    * Returns the quadrant of this ordered pair;
    *        -1 if ordered pair is on an axis.
    * 
    * @return  the quadrant (1-4) of this ordered pair, or -1 if on an axis
    */
   public int findQuadrant() {
     int output = 0;
     if (xCoordinate > 0 && yCoordinate > 0) {
       output = 1;
     } else if (xCoordinate < 0 && yCoordinate > 0) {
       output = 2;
     } else if (xCoordinate < 0 && yCoordinate < 0) {
       output = 3;
     } else if (xCoordinate > 0 && yCoordinate < 0) {
       output = 4;
     } else {
       output = -1;
     }
     return output;
   }
   
   /** 
    * Returns true if ordered pair is on X or Y-axis;
    *         false otherwise.
    * 
    * @return  true if ordered pair is on X or Y-axis; false otherwise
    */
   public boolean isOnAxis() {
     if (findQuadrant() == -1) {
       return true;
     } else {
       return false;
     }
   }
   
   /** 
    * Returns x and y-coordinates and status in quadrant or on axis.
    *
    * @return  a string representation of the object.
    */
   public String toString() {
     String output = "(" + xCoordinate + ", " + yCoordinate + ")";
     if (isOnAxis()) {
       output += " is on an axis";
     } else {
       output += " in Quadrant " + findQuadrant();
     }
     return output;
   }
   
 }