//Teresita C. Liebel
//CSE 002
//Fabruary 13,2015
//Lab 04
//Cookie lab involving user inputs, booleans, and if, else if statements


//import the scanner
import java.util.Scanner;

//add class and main method
public class Cookies{
    public static void main (String[] args){
        
        //declare Scanner
        Scanner myScanner = new Scanner( System.in );
    
            //prompt user for input-number of people
            System.out.print("Enter the number of People: ");
            
            int nPeople=0; 
            int nCookies=0;
            int nPerPerson=0;
            
            
            
            
            //check user gave an int
            if(myScanner.hasNextInt()){
            
            nPeople=myScanner.nextInt(); 
            
            if(nPeople<=0){
                 System.out.println("You did not enter an int > 0");
                 return;
            }
            }
            else{
                System.out.println("You did not enter an int");
                return; //program stops if the user didn't input an int
            }
    
                
                         
                           
                            //get input for number of cookies
                                System.out.print("Enter the number of cookies you are planning to buy: ");
                     
                            //check if input is an integer and positive
                            if(myScanner.hasNextInt()){
                            
                            nCookies=myScanner.nextInt(); 
                            
                            if(nCookies<=0){
                                 System.out.println("You did not enter an int > 0");
                                 return;
                            }
                            }
                            else{
                                System.out.println("You did not enter an int");
                                return; //program stops if the user didn't input an int
                            }
    
    
    
                                             //get input on how many cookies per person
                                                System.out.print("How many do you want each person to get? ");
    
                                            //check if input is an integer and positive
                                            if(myScanner.hasNextInt()){
                                            
                                            nPerPerson=myScanner.nextInt(); 
                                            
                                            if(nPerPerson<0){
                                                 System.out.println("You did not enter an int > 0");
                                                 return;
                                            }
                                            }
                                            else{
                                                System.out.println("You did not enter an int");
                                                return; //program stops if the user didn't input an int
                                            }
    
    
    

                        
                                                            //check if there's enough for everyone, if there is
                                                            if(nPerPerson*nPeople<=nCookies){
                                                                
                                                                if(nPerPerson==0){
                                                                        System.out.println("You have enough cookies for each person and the amount will divide evenly.");
                                                                    }
                                                                    else{
                                                            
                                                            
                                                                        if(nCookies%(nPerPerson*nPeople)==0){
                                                                            System.out.println("You have enough cookies for each person and the amount will divide evenly.");
                                                                
                                                                        }
                                                                        
                                                                        if(nCookies%(nPerPerson*nPeople)==nPeople){
                                                                            System.out.println("You have enough cookies for each person and the amount will divide evenly.");  
                                                                            }
                                                                            else{
                                                                                System.out.println("You have enough cookies for each person but they do not divide evenly.");
                                                                    }
                                                                 
                                                                    }   
                                                                
                                                            }
                                                            else{
                                                                System.out.println("You will not have enough cookies. You need to buy at least "+((nPeople*nPerPerson)-nCookies) +" more.");
                                                            }
   
        }    
    }

            