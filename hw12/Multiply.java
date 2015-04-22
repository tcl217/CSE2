//Teresita C. Liebel
//CSE 2 hw12

//import the scanner and declare the class
import java.util.Scanner;

public class Multiply{
    //identify a scanner
    Scanner myScanner=new Scanner(System.in);
    
    //the first method is the one that makes random matrices
    public static int[][] randomMatrix(int width, int height){
        //it takes input as the width and height from a user
        int[][] myArray=new int[height][width];
        
        int i=0,j=0;
        int random=(int)(Math.random()*21)-10;
        //makes a random number using Math.random
        
        //then uses a for loop to fill the multidimensional array with random numbers based on the designated heights and widths
        for(i=0;i<height; i++){
            for(j=0; j<width; j++){
                myArray[i][j]=random;
            
                random=(int)(Math.random()*21)-10;
            }
//at the end of each for loop a new random number is generated        
        random=(int)(Math.random()*21)-10;
        //System.out.println("=====");
        //System.out.println(random);

        }
    //a 2d array is then returned
        return myArray;
    }
    
    //the method print matrix is used to print out the values stored within an array (the way I tried to do it before it was just printing where the array was stored
    //in memory. oops)
    public static void printMatrix(int[][] array){
    
    //using 2 for loops again the array instead of being filled, it prints out the values at the designated positions
        //System.out.println("The array is:");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
            System.out.print(array[i][j]+"   ");
            }
            System.out.println();
       }
       
        
    } 
    //the method matrix multiply is the ugly one
    public static int[][] matrixMultiply(int[][] array1, int[][] array2){
        
        //first a new array is declared and initialized that it will have the height of the second array and the width of the first array
        int[][] finalArray=new int[array2.length][array1[0].length];
        
        //first there's an if statemtn to check if the matrices are compatabile to be multiplied, if they're not an error is printed and the program exits
        if(array2.length==array1[0].length){
            //then a series of for loops run to fill the various positons of array 1 and 2 so that they can be appropriately multiplied
        for(int i=0; i<array2.length;i++){
            //System.out.println("i="+i);
            for(int j=0; j<array1[0].length;j++){
                //System.out.println("j="+j);
                for(int k=0; k<array2[0].length;k++){
                    //System.out.println("k="+k);
                    finalArray[i][j] += array2[i][k]*array1[k][j];
                }
            }
        }
     //return finalArray;
        }
        else{
            System.out.println("Matrices are not compatabile.");
            System.exit(0);
        }
        return finalArray;//the final multiplied array is returned
    }

//this method checks that the values entered by the user for widths and heights are in factor positive integers
 public static int checkInts(){
        Scanner myScanner= new Scanner(System.in);
        
        int y=0;

                while(!myScanner.hasNextInt()){
                    System.out.println("Sorry, you didn't enter an int.");
                    y=myScanner.nextInt();
                
                    
                    while(y<=0){
                        System.out.println("Sorry, the number you entered is negative.");
                        y=myScanner.nextInt();
                    }
                }
            y=myScanner.nextInt();
        return y;    
     
    }

    //the main method brings the whole program together
    public static void main(String args[]){
    Scanner myScanner=new Scanner(System.in);

//first it asks users to enter the width and heights of each matrix, and checks them in the method checkInts
        System.out.println("Enter the width of one matrix:");
        int firstWidth=checkInts();
        
        System.out.println("Enter the height of one matrix:");
        int firstHeight=checkInts();        

        System.out.println("Enter the width of the second matrix:");
        int secondWidth=checkInts();
        
//then there is a preliminary check to make sure that the widths of one matrix correspond to the heights of the other, so they can be multiplied(this is checked once 
//in the main method and again the muliplyMatrix to catch bugs)
            while(secondWidth!=firstHeight){
                System.out.println("The widths must be equal. Try again.");
                secondWidth=checkInts();
            }
        
        System.out.println("Enter the height of the second matrix:");
        int secondHeight=checkInts();
        
            while(secondHeight!=firstWidth){
                System.out.println("The heights must be equal. Try again.");
                secondHeight=checkInts();
            }
        
        //Then array1 and array2 are created by calling randomMatrix and using the user inputted widths and heights for each matrix
        int [][] array1= randomMatrix(firstWidth,firstHeight);
        int [][] array2= randomMatrix(secondWidth,secondHeight);
        
        //then using printMatrix method both arrays are printed out
        System.out.println("The first array is:");
        printMatrix(array1);
        
        System.out.println("The second array is:");
        printMatrix(array2);
        
        //the matrixMultiply is called on using array1 and array2 to create the final multiplied array
        System.out.println("Now Multiply the matrices.");
        System.out.println("The final array is:");
        int[][] finalArray=matrixMultiply(array1,array2);
        
        //finally printMatrix is called again but this time to print out the final array
        printMatrix(finalArray);
    }
    
}