//Teresita C. Liebel
//January 30, 2015
//CSE 002
//Lab 02- Cyclometer

public class Cyclometer{
    
    // main method that's always required
    public static void main (String [] args) {
        
        int secsTrip1=480; //time for trip 1
        int secsTrip2=3220; //time for trip 2
        int countsTrip1=1561; //rotation count for trip 1
        int countsTrip2=9037; //rotation count for trip 2
        
            double wheelDiameter=27.0, //diameter of the wheel
            PI=3.14159, //pi definition
            feetPerMile=5280, //length of a mile
            inchesPerFoot=12, //how many inches per foot
            secondsPerMinute=60; //how many seconds per minute
            double distanceTrip1, distanceTrip2, totalDistance; // sum of the two total distances for trip 1 & 2
            
                System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1+" counts.");
                System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+ " minutes and had " + countsTrip2+" counts.");
                
                    //run calculations to find distances, rotation counts, times and diameter
                    distanceTrip1=countsTrip1*wheelDiameter*PI; //distance trip 1= rotation counts*diameter*pi; distance in inches
                    distanceTrip1/=inchesPerFoot*feetPerMile; //distance trip 1 in miles
                    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance trip 2 converted to miles
                    totalDistance=distanceTrip1+distanceTrip2; //total distance is sum of trip 1 & trip 2
                    
                        //Print output data
                        System.out.println("Trip 1 was "+distanceTrip1+" miles");
                        System.out.println("Trip 2 was "+distanceTrip2+" miles");
                        System.out.println("The total distance was "+totalDistance+" miles");
        
    
    } //end of main method
    
    
} //end of the class

