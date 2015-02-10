//Teresita Liebel
//CSE 002
//Hw 03
//Program 3
//Four Digits

//import the scanner
import java.util.Scanner;

    //add class and main method
    public class FourDigits{
        public static void main(String[] args){
            
            //declare scanner
            Scanner myScanner;
            
            //construct an instance for the scanner 
            myScanner=new Scanner (System.in);
            
                //Set up user prompt    
                System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
            
                //accept user input
                double amount= myScanner.nextDouble();
              
                     //cast double to int
                     
                     int remainingAmount1=(int)(amount*10000);
                    
                     int numberA= remainingAmount1%10000;
                     numberA= numberA/1000;
                     
                     int numberB=remainingAmount1%1000;
                     numberB=numberB/100;
                     
                     int numberC=remainingAmount1%100;
                     numberC=numberC/10;
                     
                     int numberD=remainingAmount1%10;
                     numberD= numberD/1;
                    
                        //set up output of the four digits
                        System.out.println("The four digits are " + numberA +numberB +numberC +numberD);
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
    }