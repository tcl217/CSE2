//Teresita C. Liebel
//CSE 2 lab 11
//Array searches

import java.util.Scanner;
import java.util.Random;

public class ArraySearches{
    public static void main(String args[]){
        
        int size=50;
        
        int[] array1;
        array1=new int[size];
        int[] array2;
        array2=new int[size];
        
        Random rand = new Random();
        
        int random1=0;
        //System.out.println(random1);

            int i=0;
            for(i=0; i<array1.length; i++){
                random1=rand.nextInt(100);
                //System.out.println(random1);
                array1[i]=random1;
                random1=rand.nextInt(100);
                
                        //System.out.println(i+") "+array1[i]);

            }
            
            int max=array1[0];
            int min=array1[0];
            
            for(int j=1; j<array1.length; j++){
                if(array1[j]>max){
                    max=array1[j];
                }
                
                if(array1[j]<min){
                    min=array1[j];
                }
            /*   
                boolean found=false;
                
                for(int max=100; max>0; max--){
                    if (array1[j]==max){
                        found=true;
                        System.out.println("The maximum of array 1 is"+max);
                        break;
                    }
                }
                for(int min=0; min<100; min++){
                    if(array1[j]==min){
                        found=true;
                        System.out.println("The minimum of array 1 is" + min);
                        break;
                    }
                } 
                
                */
                
                
                    
            }
            System.out.println("The maximum of array1 is:"+max);
            System.out.println("The minimum of array1 is:" +min);
        
        
    }
    
    //part 2- make a new array with numbers 0-100
    //then generate a random number and keep adding it to the last value of the array
    //so it will be in increasing order because you keep adding things to it
    //then you do a binary search with min max and mid (array[0], array[24] array [49]
    //try to find mins and maxes
    //if you can't it'll return the next best numbers above and below what you were looking for
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}