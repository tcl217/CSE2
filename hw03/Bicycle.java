//Teresita Liebel
//CSE 002
//HW #3

//Program 1

//import Scanner for input data
import java.util.Scanner;

    //add class and main method
    public class Bicycle{
        public static void main (String[] args){
            
            //declare Scanner to allow input
            Scanner myScanner;
            
                //declare an instance to construct the scanner 
                myScanner=new Scanner (System.in);
                
                    //Set up number of counts on a cyclometer
                    System.out.print("Enter the number of counts: ");
                    
                    //allow user input
                    int nCounts=myScanner.nextInt();
                    
                        //Set up number of seconds
                        System.out.print("Enter the number of seconds: ");
                        
                        //allow user input
                        int nSeconds=myScanner.nextInt();
                        
                            //Variable Declaration
                            double wheelDiameter=27.0,
                            PI=3.14159,
                            feetPerMile=5280,
                            inchesPerFoot=12,
                            secondsPerMinute=60,
                            minutesPerHour=60,
                            tripDistance;
                        
                            //Set up distance formula
                            tripDistance=(nCounts*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);
                            
                                //Print distance and time
                                System.out.print("The distance was " + ((int)(tripDistance*100)/100.0)+ " miles and took " + 
                                (nSeconds/secondsPerMinute) + " minutes.");
                                
                                    //Average mile per hour print out
                                    System.out.print("The average mph was " + ((int)(tripDistance/(nSeconds/secondsPerMinute/minutesPerHour)*100)/100.0));
                                    
                            
                            
                            
                                
            
            
            
            
            
        }    
        
        
        
        
    }