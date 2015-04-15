import java.util.Scanner;//import scanner
import java.util.Random;//import random 

public class hw11random{
    public static void main (String args[]){
        
        Scanner myScanner= new Scanner (System.in);//declare scanner
        
        System.out.println("Enter 15 ints for students final grades in CSE2: ");//ask user for 15 ints
    
        
        int [] checked=checkInputs();//run method checkInputs to get an array of checked; checked goes through the 3 conditons
                                    //for the ints entered to make sure they are valid before saving them in the array checked to be used
     
        System.out.print("The grades, sorted, are:");//once they're all okay values they will be printed with a for loop
       
       int j=0;
       for(j=0; j<15; j++){
       System.out.print(" "+checked[j]+" ");
       }
        
        System.out.println();
        
        int [] shuffled=random(checked);
        
        int l=0;
        for(l=0; l<15; l++){
      System.out.print(" "+shuffled[l]+" ");
       }
       System.out.println();
    }  
    
    
public static int[] checkInputs(){
        
        Scanner myScanner= new Scanner (System.in);
        
        //here in checkInputs method the array named array is delcared and initialized to hold 15 numbers. then a for loop runs 
        
        int a=15;
        int[] array= new int[a];

        int i=0;   
        int b=0;
        
        for(i=0; i<15; i++){
            //System.out.println("i="+i);
        
        //int b=myScanner.nextInt();
        
        if(myScanner.hasNextInt()){//first the if statement checks if the user entered an int, if they did b is saved as the value they entered
        //otherwise they get an error message
             b=myScanner.nextInt();
        }
        else{
            System.out.println("You did not enter an int.");
            break;
        
        }
            if(b<0||b>100){//then it checks that they entered a value between 0-100 and if not they get an error message
                System.out.println("Your number is out of the range 0-100.");
                break;
                
                
            }
                
        
        //then array[i] is saved to the value b
        array[i]=b;
        
         
          //then the if statement checks that if we are on iteration 1 or greater, it compares the value to the one of that before it, 
          //ensuring that the numbers are in order. otherwise they get an error message
          if(i>=1){
              if(array[i]<array[i-1]){
                System.out.println("The number you enter is not greater than or equal to the one before it.");
                break;
                }
            
            
            //b=myScanner.nextInt();
            
                
            }
            
        }
        return array;//array is returned to the main method as checked[]
}

public static int[] random(int [] array){
            Random rand = new Random();

            int randomNumber1 = 0;
            //int randomNumber2=rand.nextInt(14);
                
                //int[] array2 = new int[15];
                for(int i=0;i<array.length;i++)
                {
                    randomNumber1=rand.nextInt(array.length);
                    
                    int temp=array[i];
                    //System.out.println(temp);
                    array[i]=array[randomNumber1];
                    array[randomNumber1]=temp;
                    
                //randomNumber1 = rand.nextInt(array2.length);
                //randomNumber2=rand.nextInt(14);
                //System.out.println("random number:"+randomNumber1);
                //System.out.println("array" +array2[i]);
                }
                
            
        return array;
        }
        



}