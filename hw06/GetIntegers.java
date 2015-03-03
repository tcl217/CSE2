//Teresita C. Liebel
//CSE 2 homework 6
//February 28, 2015
//Program 1
//Using 5 non-negative integers inputted from the user, use loops to check that it's negative
//and sum the total of the integers

//import scanner
import java.util.Scanner;

//add class and main method
public class GetIntegers{
    public static void main(String[] args){
        
        //declare scanner
        Scanner myScanner= new Scanner(System.in);
        
        //ask user for integers
        System.out.println("Please enter 5 non-negative integers.");
        
        //declare i as a counter to make sure the user used only 5 integers
        //sum will be what the user numbers will only if they're not negative
        int i=0; 
        int sum=0;
        
        //run a four loop limiting users to 5 inputs, each time incrementing by one
        //in the loop initialize the scanner 
        //if the number is positive it's added to the variable sum
        //if the number is negative the value is disregarded, counter i is decremented and the user is asked for another value
        for(i=0; i<5; i++){
              int a=myScanner.nextInt();
              sum=sum+a;
                if(a<0){
                    sum=sum-a;
                    System.out.println("Invalid answer, try again.");
                    i--;
                }
        }
        //at the end we print the sum value of all the nonnegative integers from the user
        System.out.println("Sum is:" +sum);
       
        
    }
}