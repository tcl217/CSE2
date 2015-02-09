//Teresita Liebel
//CSE 002
//Hw 03
//Program 2

//import Scanner
import java.util.Scanner;

    //now add class and main method
    public class Root{
        public static void main (String[] args){
            
            //declare scanner instance
            Scanner myScanner;
            
            //construct a Scanner instance
            myScanner=new Scanner (System.in);
            
                //Prompt user for number
                System.out.print("Enter a double, and I print its cube root-");
            
                //accept user input
                int x=myScanner.nextInt();
                
                    //values                    
                    double guess=x/3;
                    
                    double estimate=(2*guess*guess*guess+x)/(3*guess*guess);
                    
                    double estimate2=(2*estimate*estimate*estimate+x)/(3*estimate*estimate);
                    
                    double estimate3=(2*estimate2*estimate2*estimate2+x)/(3*estimate2*estimate2);
                    
                    double estimate4=(2*estimate3*estimate3*estimate3+x)/(3*estimate3*estimate3);
        
                    double estimate5=(2*estimate4*estimate4*estimate4+x)/(3*estimate4*estimate4);
                        
                        //Print info
                        System.out.print("The cube root is " +estimate5+":"+estimate5+"*"+estimate5+"*"+
                        estimate5+"=" + (estimate5*estimate5*estimate5)); 
            
            
            
        }
        
        
        
        
        
    }