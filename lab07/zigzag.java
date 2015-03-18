//Teresita C. Liebel
//CSE 2 Lab7
//March 6, 2015

import java.util.Scanner;

public class zigzag{
    public static void main (String [] args){
        
    //4) is supposed to be above the other loops apparently
        
        Scanner myScanner= new Scanner(System.in);
        
        
        String input = "";
        boolean q=true;
       
        while(q){
    
     
                int nStars=1;
                String junk  = "";
                
                
                
               while(nStars<3||nStars>33){
                    
                System.out.println("Please enter an int between 3 and 33: ");
                            
                    while(!myScanner.hasNextInt()){
                         System.out.println("You did not enter an int. Try again.");   
                    junk = myScanner.next();
                     }
                   nStars=myScanner.nextInt();        
                }
                        
                   
                //System.out.println(nStars);
            
            
                
                //1)
                //make nStars=10 then print nStars number of "*"
               
                int i=0; //counter for the loop
                
                while(i<nStars){//while the counter is <10 it will print "*"
                    System.out.print("*");
                    i++;//increments the counter to avoid an infinite loop
                }
                
                System.out.println();
                
                
                //2)
                //So i made an inner while loop to control how many spaces are being printed out each line, and it is incrementing by one each time the loop runs. At the same time the number of spaces (stars)
                //must be less than the line number so the line number is the same as how many spaces per line
                //The outer loop controls how many lines are printed, it runs everytime the line is less than nStars-1, incrementing each time
                //it also resets stars back to zero
                            int line=1;
                            int stars=0;
                            while(line<nStars-1){
                            
                                while(stars<line){
                                    System.out.print(" ");                            
                                    ++stars;
                                }
                            System.out.print("*");
                            System.out.println();
                            line=line+1;
                            stars=0;
                                
                            }
                
            
                
                //3)
                //repeat 1
                //make nStars=10 then print nStars number of "*"
                
                i=0; //counter for the loop
                while(i<nStars){//while the counter is <10 it will print "*"
                    System.out.print("*");
                    i++;//increments the counter to avoid an infinite loop
                }
                System.out.println("");
  
  
  
  
        //wrap the whole loop in another while loop to prompt the user to run the code again or not
        //if they say Y or y it will run again, if they type anything else the code will exit
            System.out.print("Enter y or Y to go again:");  
            input = myScanner.next();
                while(!(input.equals("Y"))&&!(input.equals("y"))){
                    q=false;
                    break;
                    
                }
                                        
        }
        
        
     
        
    }
}