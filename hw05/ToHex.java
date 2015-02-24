//Teresita C. Liebel
//CSE002
//Homework 5
//February 23, 2015
//When a user inputs 3 numbers that are in the range 0-255, the program is 
//supposed to convert them to hexidecimal numbers and then make that output a string.

//import Scanner
import java.util.Scanner;

//delcare class and main method
public class ToHex{
    public static void main (String[] args){
        
        //declare scanner
        Scanner myScanner=new Scanner(System.in);
        
        //declare all the variables outside of the if statement 
        int R, G, B;
        int RHex, GHex, BHex;
        int RHex2, GHex2, BHex2;
        String Rdigit1, Rdigit2, Gdigit1, Gdigit2, Bdigit1, Bdigit2 ;
        String HexadecimalNumber;
        
        
        //ask for user input
        System.out.println("Please enter three numbers representing RGB values:");
        
        //delcare all the input integers
        R=myScanner.nextInt();
        G=myScanner.nextInt();
        B=myScanner.nextInt();
        
        
        //run an if statement to make sure the values are between 0-255
        if ((R>=0 && R <=255)&&(G>=0 && G <=255)&&(B>=0 && B <=255)){
            
            //compute the inputs each /16 and %16 to achieve the integer values for each digit
            RHex= R/16;
            RHex2=R%16;
            GHex= G/16;
            GHex2= G%16;
            BHex= B/16;
            BHex2= B%16;
            
            //cast all the integer values for each digit into strings
            Rdigit1= Integer.toString(RHex);
            Rdigit2= Integer.toString(RHex2);
            Gdigit1= Integer.toString(GHex);
            Gdigit2= Integer.toString(GHex2);
            Bdigit1= Integer.toString(BHex);
            Bdigit2= Integer.toString(BHex2);
            
            //if any of the numbers are between 10-15 they need to become letters A-F
            //run switch statements for each digit to reassign the digit variable if that is the case
                switch(Rdigit1){
                    case "10":
                       
                        Rdigit1="A";
                        break;
                    
                    case "11":
                        
                        Rdigit1="B";
                        break;
                        
                    case "12":
                       
                        Rdigit1="C";
                        break;
                        
                    case "13":
                         
                        Rdigit1="D";
                        break;
                        
                    case "14":
                         
                        Rdigit1="E";
                        break;
                        
                    case "15": 
                        
                        Rdigit1="F";
                        break;
                }
                
               switch(Rdigit2){
                    case "10":
                       
                        Rdigit2="A";
                        break;
                    
                    case "11":
                        
                        Rdigit2="B";
                        break;
                        
                    case "12":
                       
                        Rdigit2="C";
                        break;
                        
                    case "13":
                         
                        Rdigit2="D";
                        break;
                        
                    case "14":
                         
                        Rdigit2="E";
                        break;
                        
                    case "15": 
                        
                        Rdigit2="F";
                        break;
                }
                
                switch(Gdigit1){
                    case "10":
                       
                        Gdigit1="A";
                        break;
                        
                    case "11":
                        
                        Gdigit1="B";
                        break;
                        
                    case "12":
                       
                        Gdigit1="C";
                        break;
                        
                    case "13":
                         
                        Gdigit1="D";
                        break;
                        
                    case "14":
                         
                        Gdigit1="E";
                        break;
                        
                    case "15": 
                        
                        Gdigit1="F";
                        break;
                }
                
                switch(Gdigit2){
                    case "10":
                       
                        Gdigit2="A";
                        break;
                        
                    case "11":
                        
                        Gdigit2="B";
                        break;
                        
                    case "12":
                       
                        Gdigit2="C";
                        break;
                        
                    case "13":
                         
                        Gdigit2="D";
                        break;
                        
                    case "14":
                         
                        Gdigit2="E";
                        break;
                        
                    case "15": 
                        
                        Gdigit2="F";
                        break;
                }
                
               switch(Bdigit1){
                    case "10":
                       
                        Bdigit1="A";
                        break;
                    case "11":
                        
                        Bdigit1="B";
                        break;
                        
                    case "12":
                       
                        Bdigit1="C";
                        break;
                        
                    case "13":
                         
                        Bdigit1="D";
                        break;
                        
                    case "14":
                         
                        Bdigit1="E";
                        break;
                        
                    case "15": 
                        
                        Bdigit1="F";
                        break;
                }
                
                switch(Bdigit2){
                    case "10":
                       
                        Bdigit2="A";
                        break;
                        
                    case "11":
                        
                        Bdigit2="B";
                        break;
                        
                    case "12":
                       
                        Bdigit2="C";
                        break;
                        
                    case "13":
                         
                        Bdigit2="D";
                        break;
                        
                    case "14":
                         
                        Bdigit2="E";
                        break;
                        
                    case "15": 
                        
                        Bdigit2="F";
                        break;
                }
            
            //make the entire hexadecimal number one string value   
            HexadecimalNumber=(Rdigit1+Rdigit2+Gdigit1+Gdigit2+Bdigit1+Bdigit2);
            
            //print out the result
            System.out.println("The decimal numbers: R:"+R+", G:"+G+", B:"+B+", is represented in hexadecimal as: "+HexadecimalNumber);
          
            
            
            
            
            
        }//if the user input a number outside of the range of 1-255, this will print out
        else{
            System.out.println("Sorry you must enter values between 0-255.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}