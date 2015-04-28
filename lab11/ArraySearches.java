//Teresita C. Liebel
//CSE 2 lab 11
//Array searches

import java.util.Scanner;
import java.util.Random;

public class ArraySearches{
    public static void main(String args[]){
        
        int size=50;
        
//1)
        int[] array1;
        array1=new int[size];
        int[] array2;
        array2=new int[size];
        
        Random rand = new Random();
        
        int random1=0;
        //System.out.println(random1);

            int i=0;
           
//2) 
           random1=rand.nextInt(100);
            for(i=0; i<array1.length; i++){
                //System.out.println(random1);
                array1[i]=random1;
                random1=rand.nextInt(100);
                
                        //System.out.println(i+") "+array1[i]);

            }
            
            int max=array1[0];
            int min=array1[0];
 
//3)            
            for(int j=1; j<array1.length; j++){
                if(array1[j]>max){
                    max=array1[j];
                }
                
                if(array1[j]<min){
                    min=array1[j];
                }
           
            }
            System.out.println("The maximum of array1 is:"+max);
            System.out.println("The minimum of array1 is:" +min);
        
 
//4) 

            random1=rand.nextInt(100);
            //array2[0]=random1;
            
            for(int k=0; k<array2.length; k++){
                
                array2[k]=random1;
            
                int random2=rand.nextInt(100);
                random1+=random2;
             
             //System.out.println(random1);   
            }
            
            
            for(int j=1; j<array1.length; j++){
                if(array2[j]>max){
                    max=array2[j];
                }
                
                if(array2[j]<min){
                    min=array2[j];
                }
           
            }
//5)
            System.out.println("The maximum of array2 is:"+max);
            System.out.println("The minimum of array2 is:" +min);
                 
//6)

        System.out.println("Enter an int >=0:");
        
        Scanner myScanner=new Scanner(System.in);
        
        int x=myScanner.nextInt();
        
        
        if(x>=0){
          
        int index=0;  
        int low=0;
        int high=array2.length-1;
        int mid=(high+low)/2;
        //boolean check=true;
        
            while(array2[mid]!=x&&low<=high){
                
                mid=(high+low)/2;
                if(array2[mid]==x){
                    //index=mid;
                    System.out.println(x+" was found.");
                    break;
                    //check=false;
                }
                else if(array2[mid]>x){
                    high=mid-1;
                    //mid=(high+low)/2;
                    
                }
                else if(array2[mid]<x){
                    low=mid+1;
                    //mid=(high+low)/2;
                    
                }
                
            }
          
          
          
                    if(x>low){
                        System.out.println(x+" was not found.");
                        System.out.println("The number above the key was"+array2[low+1]);
                        System.out.println("The number below the key was"+low);

                    }
                    if(x<low){
                        System.out.println(x+" was not found.");
                        System.out.println("The number above the key was"+low);
                        System.out.println("The number below the key was"+array2[low-1]);
                    }
                   
          
            
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        else{
            System.exit(0);
        }
    
    
    //part 2- make a new array with numbers 0-100
    //then generate a random number and keep adding it to the last value of the array
    //so it will be in increasing order because you keep adding things to it
    //then you do a binary search with min max and mid (array[0], array[24] array [49]
    //try to find mins and maxes
    //if you can't it'll return the next best numbers above and below what you were looking for
    
    
    }
    
    
}