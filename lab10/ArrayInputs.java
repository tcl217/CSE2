//Teresita Liebel
//CSE 2 lab 10
//April 3, 2015

import java.util.Scanner;

public class ArrayInputs{
    public static void main (String[] args){
        
        Scanner myScanner= new Scanner(System.in);
        
        System.out.println("Please enter an integer for the size of an array: ");
        
        int x=myScanner.nextInt();
        
       int[] t = checkInts(x);
       
        System.out.println("The array is:");
       for(int i=0; i<t.length; i++){
           System.out.println(t[i]);
       }
        
       
        
    }      
    
    public static int[] checkInts(int a){
        Scanner myScanner= new Scanner(System.in);
        
        int[] array= new int[a];
        
        System.out.println("Please enter"+a+" positive integer:");
        
        int y=0;

            int j=0;        
            for(j=0; j<a; j++){
                while(!myScanner.hasNextInt()){
                    System.out.println("Sorry, you didn't enter an int.");
                    y=myScanner.nextInt();
                
                    
                    while(y<=0){
                        System.out.println("Sorry, the number you entered is negative.");
                        y=myScanner.nextInt();
                    }
                }
            y=myScanner.nextInt();
            
            
            
                array[j]=y;
            
            
        }
        
        
        return array;
    }

        
        
        
        
        
        
        
        
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}