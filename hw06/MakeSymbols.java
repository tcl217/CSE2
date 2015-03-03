//Teresita C. Liebel
//CSE 2 Homework 6
//Program 3
//March 2, 2015
//This program is supposed to take a random number and print out that many * if even and & if odd

public class MakeSymbols{
    public static void main(String[] args){


    //generate random int between 0&100
    double x;
        x = Math.random() * (100 - 0) + 0;
        int number  = (int) x;
       
        System.out.println("Random Number Generated:"+number);
        
        int counter=1;
        
        if (number%2==0){
            System.out.print("The output pattern:");
        do{
        System.out.print("*");
        
        counter++;
        }while(counter<number);
        System.out.println();
        
        }
        else{
            System.out.print("The output pattern:");
        do{
        System.out.print("&");
        
        counter++;
        }while(counter<number);
        System.out.println();
        
        }
    
        
        
        
        
        
        
        
        
        
        
        
    }
}