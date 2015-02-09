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
                double nDouble= myScanner.nextDouble();
              
                     //cast double to int
                     int nInt= (int)nDouble;
              
                     //declare variables
                     int nInt2= nInt*10000;
                     int nInt3= (int)(nDouble*10000);
            
                
                        //set up output of the four digits
                        System.out.println("The four digits are " + (nInt3-nInt2));
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
    }