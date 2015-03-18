//Teresita C. Liebel
//CSE 002 HW 07
//March 14, 2015
//This code is supposed to make stacks of numbers based on user inputs. There should be 3 stacks created using nested loops, one for for loops, 
//one for while loops, and one for do while Loops

//import scanner and make class, main method, and declare scanner
import java.util.Scanner;

public class waves{
    public static void main (String [] args){
 
        Scanner myScanner= new Scanner(System.in);
        
        //ask for user input
        System.out.print("Enter a number between 1 and 30: ");
        
        //declare and initialize some values
        int x=1;
        int number;
        int line;
        int k;
        
        
        
        //FOR LOOP
        
        //this original for loop checks to make sure the user entered an appropriate number and if they didn't
        //they're prompted to give another one
        for(x=myScanner.nextInt(); x<1||x>30;){
                   System.out.println("Please enter a number in the range.");
                    x=myScanner.nextInt();
                    
                   
               }
               
        System.out.println();    
        System.out.println("FOR LOOP:"); 
        //k is a counter to distinguish the even and odd values because the even numbers form an increasing triangle 
        //while the odd numbers form a decreasing triangle, and the value must me less than or equal to the input value and
        //increment each time
            for(k=1; k<=x; k++){
            
                        //if statement to check if k is even or odd
                       if(k%2==0){         
                                //if it is even the triangle increases each time, the number printed is number, it is incremented
                                //each time and it must be less than the line number +1
                                //line number must be less than k (which is less than or equal to x)
                                for(line=0; line<k; line++){
                                
                                for(number=0; number<line+1; number++){
                                    
                                //then k is printed to get the numbers and a println is printed to go to the next line and start a new line
                                System.out.print(k);    
                                    
                                }
                                
                                System.out.println();
                                }
                                
                       }//if k is odd the triangle decreases each time the code prints an odd number
                       else{
                                //the line number now equals k, and it decrements each time until it reaches zero then breaks
                                for(line=k; line>0; line--){
                                
                                //the number printed follows the same pattern except it equals k, is decremented each time the reaches zero and breaks
                                for(number=line; number>0; number--){
                                    
                                //again k and a println are printed
                                System.out.print(k);    
                                    
                                }
                                
                                System.out.println();
                                }
                       }
            
            
            }
        
        
        System.out.println();
        System.out.println("WHILE LOOP:");
        
            //WHILE LOOP
            
            //the while loop does the same as the for loop but is formatted differently       
            //here it checks initially that the values are within 1 & 30 inclusively
            //if not the user is prompted to enter a valid number, they will keep being asked for a a new number until 
            //the input x no longer satisfies the while statement, then x is saved as the user input
            while(x<1||x>30){
                 System.out.println("Please enter a number in the range.");
                    x=myScanner.nextInt();
                                
                               
               }
            
            //here our k counter starts at one and is checked to be less than or equal to 1, while this is true, the inner if 
            //statement runs to distinguish the even or odd patterns
            k=1;
            while (k<=x){
            
                       if(k%2==0){ //now if k is even again         
                                line=0;//the line number is set to 0
                                while(line<k){//then if it is less than k this while loop runs until that's not true
                                
                                    number=0;//number counter is initialized at 0
                                    while(number<line+1){//and this while loop runs until number is no longer less than line+1
                                    
                                //after breaking from each loop a k is printed and number is incremented
                                System.out.print(k); 
                                number++;
                                    
                                }
                                //then a println is printed and line is incremented
                                System.out.println();
                                line++;
                                }
                                
                       }
                       else{//the else statement is if k is odd
                                line=k;//then line number is initialized at k
                                while(line>0){//the while loop here runs while line>0
                                
                                    number=line;//then number is set =line
                                    while(number>0){//the second while loop runs while number >0
                                    
                                //after exiting each loop k is again printed and this time number is decremented 
                                System.out.print(k);  
                                number--;
                                    
                                }
                                //then a println is printed and line number is again decremented (so it will make the decreasing triangle)
                                System.out.println();
                                line--;
                                }
                       }
            //way down here k is incremented so each time the while loop runs it will increase by one to then check if it is even or odd
            k++;
            }
            
        
        
        //DO WHILE LOOP
                System.out.println();
                System.out.println("DO WHILE LOOP:");
                
                //now for the do while loop
                //first we run an if statement BEFORE the do while loop, because do while loops always run at least once
                //so without the do while loop the code asks the user for a number in the range and expects a new input even if the original 
                //input WAS in the range
                if(x<1||x>30){
                    do{
                        System.out.println("Please enter a number in the range.");
                        x=myScanner.nextInt();
                }while(x<1||x>30);
                
                }
            
                 
                 //the do while loop runs basically the same as the while loop except it doesn't check the conditional until after it runs once               
                               
               
            //initialize k to 1 and do the inner loop while k<=x
            k=1;
            do{
                //if its even the next inner loop will run
                if(k%2==0){         
                line=0;//line number is initialized to 0
                
                    do{//then this do while loop runs
                    number=0;//number is initialized at 0
                        do{      
                            System.out.print(k); //k is printed and number is incremented
                            number++;
                                    
                        }while(number<line+1);//then it checks to make sure number <line+1
                                
                    System.out.println();//then a println is printed and line number is incremented
                    line++;
                    }while(line<k);//then line is checked to be <k
                                
                }
                else{//then when k is odd
                
                    line=k;//line is initialized at k
                    do{
                        number=line;//then number is set =line
                        
                        do{
                           System.out.print(k);  //then a k is printed and number is decremented
                           number--;
                                    
                        }while(number>0);//then it checks that number >0
                                
                    System.out.println();//then println is printed and line number is decremented
                    line--;
                    }while(line>0);//then line is checked to be >0
                       
                    
                }
            
            k++;//k is incremented each time this loop runs
            }while(k<=x);//at the end it is checked to be k<=x


        
    }
}