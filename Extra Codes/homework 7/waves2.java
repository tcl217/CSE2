//Teresita C. Liebel
//CSE 002 HW 07
//March 14, 2015
//This code is supposed to make stacks of numbers based on user inputs. There should be 3 stacks created using nested loops, one for for loops, 
//one for while loops, and one for do while Loops

//import scanner and make class, main method, and declare scanner
import java.util.Scanner;

public class waves2{
    public static void main (String [] args){
 
        Scanner myScanner= new Scanner(System.in);
        
        //start with attempted for loop
        System.out.print("Enter a number between 1 and 30: ");
        
        int x=1;
        
        
        int number;
        int line;
        int k;
 

        
        
               for(x=myScanner.nextInt(); x<1||x>30;){
                   System.out.println("Please enter a number in the range.");
                    x=myScanner.nextInt();
                    
                   
               }
            
            
            for(k=1; k<=x; k++){
            
                       if(k%2==0){         
                                for(line=0; line<k; line++){
                                
                                for(number=0; number<line+1; number++){
                                    
                                
                                System.out.print(k);    
                                    
                                }
                                
                                System.out.println();
                                }
                                
                       }
                       else{
                                
                                for(line=k; line>0; line--){
                                
                                for(number=line; number>0; number--){
                                    
                                
                                System.out.print(k);    
                                    
                                }
                                
                                System.out.println();
                                }
                       }
            
            
            }
            
            
            
            
          
}
}