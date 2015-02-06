//Teresita Liebel
//CSE 002
//Lab 03
//February , 2015
//Big Mac Lab- cost of buying Big Macs


//import the scanner outside of the class and main method
import java.util.Scanner;

//Now add class and method
public class BigMac {
    public static void main (String[] args){
        
        //declare scanner like a variable
        Scanner myScanner;
        
            //construct the Scanner class declared as myScanner
            //making an instance for input
            myScanner=new Scanner (System.in);
        
                //now ready for input
                //number of Big Macs
                System.out.print("Enter the number of Big Macs(an integer >0):");
        
                    //accepting input with statement
                    int nBigMacs= myScanner.nextInt();
                    
                        //cost of Big Mac and percent sales tax
                        System.out.print("Enter the cost per Big Mac as" + " a double (in the form xx.xx): ");
                        double bigMac$= myScanner.nextDouble();
                        System.out.print("Enter the percent tax as a whole number (xx): ");
                        double taxRate= myScanner.nextDouble();
                        taxRate/=100; //because the input gives me a percent and I need a whole #, porportion
                        
                            //fix amounts
                            double cost$;
                            int dollars, dimes, pennies; //whole dollar amount of cost to store digits
                        
                            //whole amount, getting rid of decimals and fractions
                            cost$= nBigMacs*bigMac$*(1+taxRate);
                                
                            //dollar amount    
                            dollars=(int)cost$;
                            
                            //dimes amount
                            dimes=(int)(cost$*10)%10;
                            
                            //pennies amount
                            pennies= (int)(cost$*100)%10;
                            
                            //Final print out
                            System.out.println("The total cost of " +nBigMacs + " BigMacs, at $"+bigMac$ + 
                            " per bigMac, with a" + "sales tax of " + (int)(taxRate*100) + 
                            "%, is $"+dollars+'.'+dimes+pennies);
        
    }
    
    
    
    
    
}
