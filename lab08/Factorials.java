//Teresita Liebel
//CSE 2 Lab #8
//Factorial Lab
//This lab we're exploring methods, the class will call 3 different methods, we need to code the 3 methods

//import a scanner
import java.util.Scanner;

//add class and main method to start
public class Factorials{
    public static void main (String [] args){
 
        //initialize the scanner
        Scanner myScanner= new Scanner(System.in);
        
        System.out.println("Please enter an integer.");
        
        int input=myScanner.nextInt();
        int sum=0;
        int x=1;//make a counter
        
        //while the counter x is <= to user input, the value of sum becomes 
        //the factorial of counter x, and each time x is incremented, factorial
        //is reevalutated at the new x value, and then that value is added 
        //to the sum value
        while(x<=input){
            sum+=factorial(x);
            x++;
        }
    //here we invoke the print method to evaluate sum in the print method
    print(sum);
    
        
    }
    
    //make the next method factorial(x)
    //this takes a positve integer and returns the factorial of the integer
    //for my code it will take x from the main method, and while counter y<=x
    //the value of z will be multiplied by each value of y as y is incremented
    //up until the input value from the user (x)
    public static int factorial(int a){
        //make 2 morer counters
        int y=1;
        int z=1;
        
        while(y<=a){
            z*=y;
            y++;
        }
        
        //here it will print out each value of z, and then return z, enabling it 
        //to be used out of the method
        //z will then become sum each time
        System.out.println(z);
        return z;
    }
    
    //make the next method to print out the final number
    //print is taking sum, which was actually z from the factorial method, 
    //and all it does it print it out
    public static void print(int b){
        System.out.println("The super factorial is equal to " + b);
    }
    
    
    
}