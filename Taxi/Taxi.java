package Taxi;
class Taxi implements Cloneable{
     private char currentLocation = 'A';
     private int taxiId;
     private int customerId;
     private char pickupLocation;
     private char dropLocation;
     private int pickupTime;
     private int dropTime;
     private double earnings; 

     protected Object clone() throws CloneNotSupportedException {
         return super.clone(); 
     }
     
     public void setTaxiId(int taxiId){
          this.taxiId = taxiId;
     }
     
     public  int getTaxiId(){
           return taxiId;
     }
     
     public void setCustomerId(int  customerId){
           this.customerId = customerId;
     }
     
     public int getCustomerId(){
           return customerId;
     }
     
     public void setCurrentLocation(char  currentLocation){
           this.currentLocation = currentLocation;
     }
     
     public char getCurrentLocation(){
           return currentLocation;
     }
     
     public void setPickupLocation(char  pickupLocation){
           this.pickupLocation = pickupLocation;
     }
     
     public char getPickupLocation(){
           return pickupLocation;
     }
     
     public void setDropLocation(char  dropLocation){
            this.dropLocation = dropLocation;
     }
     
     public char getDropLocation(){
            return dropLocation;
     }
     
     public void setPickupTime(int pickupTime){
            this.pickupTime = pickupTime;
     }
     
     public int getPickupTime(){
            return   pickupTime;
     }
     
     public void setDropTime(int dropTime){
             this.  dropTime = dropTime;
     }
     
     public int getDropTime(){
            return     dropTime;                        
     }
     
     public void setEarnings(double  earnings){
            this.earnings = earnings;
      }
      
      public double getEarnings(){
            return earnings;
      }
       
      public String toString(){
          StringBuilder sb = new StringBuilder();
          sb.append("----------------------------------------------------\n");
          sb.append(String.format("| %-20s : %-30s|\n","Taxi id is",getTaxiId()));
          sb.append(String.format("| %-20s : %-30s|\n","customer id is",getCustomerId()));
          sb.append(String.format("| %-20s : %-30s|\n","current Location is",getCurrentLocation()));
          sb.append(String.format("| %-20s : %-30s|\n","pickUp Location is",getPickupLocation()));
          sb.append(String.format("| %-20s : %-30s|\n","Drop Location is",getDropLocation()));
          sb.append(String.format("| %-20s : %-30s|\n","pickup Time is",getPickupTime()));
          sb.append(String.format("| %-20s : %-30s|\n","Drop Time is",getDropTime()));
          sb.append(String.format("| %-20s : %-30s|\n","Total Earnings is",getEarnings()));
          sb.append("----------------------------------------------------\n");
          return sb.toString();
      }
 }         
          
          
                                                                                                                               
