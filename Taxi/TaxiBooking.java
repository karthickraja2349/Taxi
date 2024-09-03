package Taxi;
import java.util.List;
import java.util.ArrayList;
class TaxiBooking {
    private List<Taxi> taxiList = new ArrayList<>();
    private List<Taxi> taxiHistory = new ArrayList<>();
    private int taxiLimit = 4;
    private int idGenerator = 1;

    protected TaxiBooking() {
        initializeTaxis();
    }

    private void initializeTaxis() {
        for (int i = 0; i < taxiLimit; i++) {
            Taxi taxi = new Taxi();
            taxi.setTaxiId(i + 1);
            taxiList.add(taxi);
        }
    }

    protected String booking(char pickupLocation, char dropLocation, int pickupTime) throws CloneNotSupportedException {
        int minimumDistance = Integer.MAX_VALUE;
        Taxi taxiReady = null;
        for (Taxi taxi : taxiList) {
            if(taxi.getDropTime()<=pickupTime && Math.abs(pickupLocation - taxi.getCurrentLocation()) <= minimumDistance)
			{
				if(Math.abs(pickupLocation - taxi.getCurrentLocation())==minimumDistance) 
				{
				  if(taxiReady!=null && taxi.getEarnings()<taxiReady.getEarnings())
                  taxiReady = taxi;  
                }
                else
				{
				  taxiReady = taxi;
				  minimumDistance = Math.abs(pickupLocation - taxi.getCurrentLocation());
				}
            }
        }
        if (taxiReady != null) {
            int travelTime = Math.abs(dropLocation - pickupLocation);
            taxiReady.setPickupLocation(pickupLocation);
            taxiReady.setDropLocation(dropLocation);
            taxiReady.setPickupTime(pickupTime);
            taxiReady.setDropTime(pickupTime + travelTime);
            taxiReady.setCurrentLocation(dropLocation);
            taxiReady.setCustomerId(idGenerator++);
            taxiReady.setEarnings(taxiReady.getEarnings() + (travelTime * 15 - 5) * 10 + 100);
            taxiHistory.add((Taxi) taxiReady.clone());

            return "Taxi number " + taxiReady.getTaxiId() + " is booked!";
        }

        return "Taxis not available";
    }

    public void displayDetails() {
        System.out.println("---------------------");
        for (Taxi taxi : taxiList) {
            System.out.println(taxi);
        }
        System.out.println("---------------------");
    }
}
