//Teresita C. Liebel
//CSE 2 Homework 6
//Program 2
//March 2, 2015

//This program is to take integers between 9&16 and then calculate the factorial of that number

//add scanner
import java.util.Scanner;

//declare class and main method
public class RunFactorial{
    public static void main (String[] args){
        
        //declare scanner
        Scanner myScanner=new Scanner(System.in);
        
        //ask for user input
        System.out.println("Please enter an integer between 9 & 16.");
        int a=0;//initialize a as 0 to start
        
        //set up counter variable i and answer variable
        int answer=1;
        int i=1;
        
        //run the first while loop to check for a valid input, the first one check that it is in fact 
        //an integer and not a double or anything.
        
        //variable string junk collects the user input if it isn't an integer
        //it's basically just a place holder
        String junk  = "";
            while(!myScanner.hasNextInt()){
            
            //System.out.println("hello");
            System.out.println("Invalid input, try again,");
            junk = myScanner.next();
            }
        
        //if the user entered a variable that is an integer it is stored in int a
        a=myScanner.nextInt();
        
        //then a is check to be with the range of 9&16 inclusively
        //if it isn't the user is prompted to give a number until it is
            while(a<9||a>16){
                System.out.println("Invalid input, try again,");
            a=myScanner.nextInt();
                
            }
        
            //finally run the factorial while loop!
            //int x is a variable that starts at the user value of a, but each time the value of it decreases by 1
            //the while loop runs everytime the counter i is <= user input a
            //each time the loop runs it also increments i by one 
            //also each time the loop runs the answer variable starting at 1 is continuously multipled by the decreasing value of x
            //this is where the factorial part comes in so while i is <=a answer will be x*(x-1)*(x-2) and etc. 
                            int x=a;
                            while(i<=a){
                    
                            answer=answer*x;
                            i++;
                            x=x-1;
                            }
                            
                        
        
        //print answer out
        
        System.out.println("Input Accepted:"+a+"!= "+answer);
        

        
        
        
        
        
    }
}