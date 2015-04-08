//Teresita Liebel
//CSE 2 lab 10
//April 3, 2015

import java.util.Scanner;

public class ArrayInputs{
    public static void main (String[] args){
        
        Scanner myScanner= new Scanner(System.in);
        
        System.out.println("Please enter an integer for the size of an array: ");
        
        int x=myScanner.nextInt();
        
        System.out.println("Please enter "+ x+ " positive integers:");
        int y=myScanner.nextInt(x);
    
        int[] array= new int[x];
        
        for(y=myScanner.nextInt; y<x; ){
            array[y]=y;
        }
        System.out.println("The Array is:");
        System.out.println(y);
        
    
       // int w=CheckInts(x);
        
        
        
        
        
    }      
//        public static int CheckInts(int i){
        
//        int a=0;    
//        while (a<=i){
//            int y=myScanner.next();
        
            
//            while (i!=nextInt()){
//                System.out.println("Sorry, you didn't enter an integer.");
//               int j=myScanner.next();
//            }
//            while(i<0){
//                System.out.println("Sorry, the number you entered is negative.");
//                int j=myScanner.next();
//            }
//        }
//    }
        
        
        
        
        
        
        
        
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}