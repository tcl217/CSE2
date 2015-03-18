import java.util.Scanner;

public class waves3{
    public static void main (String [] args){
 
        Scanner myScanner= new Scanner(System.in);
        
        //start with attempted for loop
        System.out.print("Enter a number between 1 and 30: ");
        
        int x=1;
        
        
        int number;
        int line;
        int k;
        
        
        
        
        
        
        
            x=myScanner.nextInt();        
                if(x<1||x>30){
                    do{
                        System.out.println("Please enter a number in the range.");
                        x=myScanner.nextInt();
                }while(x<1||x>30);
                
                }
            
                 
                                
                               
               
            
            k=1;
            do{
            
                       if(k%2==0){         
                                line=0;
                                do{
                                
                                    number=0;
                                    while(number<line+1){
                                    
                                
                                System.out.print(k); 
                                number++;
                                    
                                }
                                
                                System.out.println();
                                line++;
                                }while(line<k);
                                
                       }
                       else{
                                line=k;
                                do{
                                
                                    number=line;
                                    while(number>0){
                                    
                                
                                System.out.print(k);  
                                number--;
                                    
                                }
                                
                                System.out.println();
                                line--;
                                }while(line>0);
                       }
            
            k++;
            }while(k<=x);
            







        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}