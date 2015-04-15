//Teresita C. Liebel
//CSE 2 hw 11
//4/12/15

import java.util.Scanner;//import scanner
import java.util.Random;//import random 

//declare class and main method

public class CSE2Linear{
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
        System.out.println("Enter a number to be searched for:");//then a binear search will run using method binary with input checked
            
        binary(checked); 
        
        System.out.println("Scrambled array:");//then the array will be scrambled using the method random and input checked
        int [] shuffled=random(checked);
        
        //then using another for loop the new scrambled array will be printed
        int l=0;
        for(l=0; l<15; l++){
        System.out.print(" "+shuffled[l]+" ");
       }
       System.out.println();
        
         
        System.out.println("Enter a new number to be searched for:");//finally a linear search will run using method linear with input shuffled from the 
                                                                    //method random
        linear(shuffled);        
    
        
        
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
        
        
        //System.out.println("hi");
        return array;//array is returned to the main method as checked[]
    }
    
    
    public static void linear(int[] c){
        Scanner myScanner= new Scanner (System.in);
        boolean found = false;
        
        //in method linear, a user inputs a value (search) and a for loop runs to check if that value is found; boolean found is also set equal to false
        //once (if at all) it is found, then found changes to be true; if the value isnt found, a user gets a message that it wasn't found
        int search=myScanner.nextInt();
        int k=0;
             for(k=0; k<15; k++){
                 if(c[k]==search){
                     found = true;
                     System.out.println(search+ " was found after "+(k+1)+" iterations.");
                     break;
                 }
                 
             }
             if(!found){
                 System.out.println(search+" was not found after "+(k+1)+" iterations.");
                 
             }
        
    }
    
    public static void binary(int[] d){
        
    //this method binary runs a binary search, which is much longer with lots of if and else if and else statements
    //the user inputs a value and then the method runs to check if that value is set to the different values, based on how the array is 
    //binarily broken up
    
    Scanner myScanner=new Scanner(System.in);
    
    int newSearch=myScanner.nextInt();
    
    if(d[7]==newSearch){//it goes first to the middle, if it =7 we stop searching
             System.out.println(newSearch+ " was found after 1 iteration.");
  
    }
    else if(d[7]>newSearch){//if the value entered is less than 7, more divisions occur
        if(d[4]==newSearch){//next value at 4 is checked if that is equal to the value we stop searching
             System.out.println(newSearch+ " was found after 2 iterations.");

        }
        else if(d[4]>newSearch){//if 4 is too big 2 is checked
            
            if(d[2]==newSearch){//if 2 works we stop searching
                System.out.println(newSearch+ " was found after 3 iterations.");

            }
            else if(d[2]>newSearch){//if 2 is too big 1 is checked
                if(d[1]==newSearch){//if the value at 1 is equal to input value we stop searching
                    System.out.println(newSearch+ " was found after 4 iterations.");
                    
                }
                else if (d[1]>newSearch){//if value at 1 is too big the value at 0 is checked
                    if(d[0]==newSearch){//if at 0 the values are equal we stop searching
                        System.out.println(newSearch+ " was found after 5 iterations.");

                    }
                    else{//if 0 doesn't work there's nothing left that was <7,<4,<2,&<1 so the value wasn't found
                    
                    System.out.println(newSearch+ " was not found after 5 iterations.");
                    }
                }
                
            }
            else if(d[2]<newSearch){//if the value at 2 was too small it's checked at 3
                if(d[3]==newSearch){//if 3 works we stop searching
                    System.out.println(newSearch+ " was found after 4 iterations.");
                    
                }
                else{//otherwise the value wasn't found because nothing is left <7,<4,>2
                    System.out.println(newSearch+ " was not found after 5 iterations.");
                
            }
            
            
        }
        else if(d[4]<newSearch){//if 4 is too small we check the value at 6
            
            if(d[6]==newSearch){//if at 6 it works we stop searching
                System.out.println(newSearch+ " was found after 3 iterations.");

            }
            else if(d[6]>newSearch){//if 6 is too big at 5 it is checked
                if(d[5]==newSearch){//if 5 works we stop searching
                    System.out.println(newSearch+ " was found after 4 iterations.");
                    
                }
                else{//if 5 doesnt work the value isnt found because there's nothing >4,<6
                    System.out.println(newSearch+ " was not found after 4 iterations.");

                }
                
            }
            else if(d[6]<newSearch){//if the value at 6 is too big it is not found because there's nothing <7,& >6
                System.out.println(newSearch+ " was not found after 4 iterations.");
                
            }
            
        }
        
    }
}
    else if(d[7]<newSearch){//if the value at 7 is too small we check the value at 11
        
        if(d[11]==newSearch){//if the value at 11 works we stop searching
             System.out.println(newSearch+ " was found after 2 iterations.");

        }
        else if(d[11]>newSearch){//if at 11 the value is too big we check 9
            
            if(d[9]==newSearch){//if at 9 the values are equal we stop searching
                System.out.println(newSearch+ " was found after 3 iterations.");

            }
            else if(d[9]>newSearch){//if 9 is too big we check the value at 8
                if(d[8]==newSearch){//if at 8 the value works we end the loop
                    System.out.println(newSearch+ " was found after 4 iterations.");
                    
                }
                else{//if 8 doesn't work the value isn't in the array, there's nothing else >7, <11, &<9
                    System.out.println(newSearch+ " was not found after 4 iterations.");

                }
                
            }
            else if(d[9]<newSearch){//if the value at 9 is too small we check 10
                if(d[10]==newSearch){//if 10 works we stop searching
                    System.out.println(newSearch+ " was found after 4 iterations.");
                    
                }
                else{//if the value at 10 isn't it, it doesn't exist because nothing else is >7,<11,&>9
                    System.out.println(newSearch+ " was not found after 4 iterations.");
                
            }
            
            
        }
        else if(d[11]<newSearch){//if the value is greater than that at 11 we check 14
            
            if(d[14]==newSearch){//if at 14 it works we stop searching
                System.out.println(newSearch+ " was found after 3 iterations.");

            }
            else if(d[14]>newSearch){//if at 14 it's too big we check 13
                if(d[13]==newSearch){//if at 13 it works we stop searching
                    System.out.println(newSearch+ " was found after 4 iterations.");
                    
                }
                else if(d[13]>newSearch){//if 13 is too big we check 12
                    if(d[12]==newSearch){//if 12 works we stop searching
                      System.out.println(newSearch+ " was found after 5 iterations.");
  
                    } 
                    else{//if 12 doesn't work the value doesn't exist in the array because nothing else is >7, >11, <14, & <13
                      System.out.println(newSearch+ " was not found after 5 iterations.");
  
                    }
                }
                else if(d[13]<newSearch){//if at 13 the value is too big it doesn't exist because nothing else is >7, >11, <14
                    System.out.println(newSearch+ " was not found after 5 iterations.");
                    
                }
                
                
            }
            else if(d[14]<newSearch){//if at 1 the value is too small we check at 15
                if(d[15]==newSearch){//if the value at 15 equals our search value we stop searching
                    System.out.println(newSearch+ " was found after 4 iterations.");
                    
                }
                else{//if the value at 15 isn't equal then the value isn't in the loop because nothing else is >7,>11, >14
                    System.out.println(newSearch+ " was not found after 4 iterations.");
                
            }
            
        }
        
        }}}
    
    
}


        public static int[] random(int [] array){//method random originally creates a for loop 
            Random rand = new Random();

            int randomNumber1 = 0;
            //int randomNumber2=rand.nextInt(14);
                
                //int[] array2 = new int[15];
                for(int i=0;i<array.length;i++){//within the for loop a random number is generated for each iteration, temp is set equal to the input values (checked)
                //then array at i becomes array at random number, then array at randomnumber1 is set to temp, eessentially swapping out the index values of checked for 
                //the new random numbers
                
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