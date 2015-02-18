//Teresita C. Liebel
//CSE 002
//Hw 04
//Program 2
//Banking with Switch statements which I still don't understand :/

//import the scanner
import java.util.Scanner;

//then declare class and main method
public class Banking{
    public static void main(String[] args) {
        
    //declare instance for the scanner
    Scanner myScanner=new Scanner(System.in);
    
        //give the user a random number to start with in their bank account
        //between $1,000 & $5,000
    
        int randomNum = (int)(Math.random()*(5000-1000))+1000;
       
            //then ask the user if they want to deposit withdraw of view their balance
            //use a switch statement
            
            System.out.println("State if you would like to: deposit money by typing '1', withdraw money by typing '2', or view your balance by typing '3'");
            //give numberical values to the various requests to make them integers and easier to work with
            
            //declare variables outside of the switch statement
            int request;
            int value1;
            int value2;
            

            //check that the user inputs a 1, 2, or 3 only
            if(myScanner.hasNextInt(1)|myScanner.hasNextInt(2)|myScanner.hasNextInt(3)){
                request=myScanner.nextInt();
            
            
            //make switch statement
            switch(request){
                case 1:{//case 1 is for a deposit
                    System.out.println("How much would you like to be deposit? ");//ask the user for the deposit amount
                
                    //do the math add the deposit amount (value1) to the random number that's their balance
                    value1 = myScanner.nextInt();
                    //check that the input value is positive
                    if(value1>=0){
                    System.out.println("Your resulting balance is "+(randomNum+value1));
                    }
                    else{
                        System.out.println("Sorry your deposit amount must be positive.");
                    }
                    break;}
                
                case 2: {//case 2 is for withdrawing money
                    System.out.println("How much would you like to withdraw? ");//ask user for the withdraw amount
                    value2=myScanner.nextInt();
                    
                    //check that the withdraw value is also positive
                    if(value2>=0){
                    //compute the random number that's the bank balance minuse the withdraw (value2) amount   
                    System.out.println("Your resulting balance is "+(randomNum-value2));
                    }
                    else{
                        System.out.println("Sorry your withdraw amount must be positive.");
                    }
                    break;}
                    
                case 3://case 3 is just to show their balance
                    System.out.println("Your bank balance is "+randomNum);//show balance
                    break;
            }
        
            }
            else{
                System.out.println("This is not a valid input");
            }
            
    
    }
}