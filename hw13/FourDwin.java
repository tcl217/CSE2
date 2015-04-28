//Teresita C. Liebel
//CSE 2 HW# 13

//import Scanner and declare class
import java.util.Scanner;


public class FourDwin{
   
   
   //the method statArray displays the statistics of the final array, it takes input of the 
   //4D array, and the dimensions of that array (random 1,2,3, and 3)
    public static void statArray(double [][][][] array, double a, double b, double c, double d){
        System.out.println("Statistics");
        
        //to find the number of members I just multiplied the size of the 3D arrays by how many there were(3)
        double threeDMembers=(d*c);
        //then I multiplied how many twoD arrays there were times how many 3D arrays there were
        double twoDMembers=(b*threeDMembers);
        //then I multiplied how many 1D arrays there were into each of the 2D arrays in the 3D ones
        double oneDMembers=a*twoDMembers;
        //then that was my total number of members
        double members= oneDMembers;
        
        System.out.println("Members: "+members);
        
        double sum=0;
        //sum started at 0
        
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                for(int k=0; k<array[i][j].length; k++ ){
                    for(int l=0; l<array[i][j][k].length; l++){
                        
                        sum+= array[i][j][k][l];
                        //then i looped through 4 for loops to access each array value, and as it looped those values were 
                        //saved into sum
                    }
                }
            }
        }
        
        //here i truncated sum to keep it managable
        sum=Math.floor(sum * 1000) / 1000;
        
        //print it out
        System.out.println("Sum: "+sum);
        
        //find the mean by dividing the sum by the number of members (and truncating it)
        double mean=Math.floor((sum/members) * 1000) / 1000;
        
        //then I printed it
        System.out.println("Mean: "+mean);
        
        
    }
    
    //to sort the 4D array we take in the 4D array (after it's been sorted accordingly by 3Dsort)
    public static void sort4DArray(double [][][][] array){
        
        //this insertion sort only requires a little code because we're only moving around the number of 3D arrays
        //in the 4D one, and there are only 3
        
        //the first for loop loops through the 3 3D arrays, and sets current element to be the first value
        for(int i=1; i<array.length; i++){
            
            double currentElement=array[i][0][0][0];
           
            //then j is set equal to i, and then it is checked if the element to the left is actually bigger,
            //we shift to the right
            
            int j=i;
            while(j>0 && array[j-1][0][0][0] >currentElement){
                array[j][0][0][0]=array[j-1][0][0][0];
                j--;
            }
            
            //then current elements is reassigned
            array[j][0][0][0]=currentElement;
           
        }
        
    }
    
    //the method 3Dsort takes the 3D arrays that are in our 4D one as input
    public static void sort3DArray(double [][][] array){
        
        //declare min and the min index so we can use them
        double min;
        int minIndex;
        
        
        //then we loop through the 3D, 2D, and 1D array
        //once we get to the 1D array, that's when we use selection sort to switch around the 1D
        //values so that they are in increasing order in each array
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++ ){
                for(int k = 0; k<array[i][j].length-1; k++){
                    
                    minIndex = k;
                    min=array[i][j][k];
                    
                    //this for loop finds those smallest values
                    for(int l=k+1; l<array[i][j].length; l++){
                    
                        //here is where the min values are reassigned each increment, because with selection sort
                        //the min has to change as we sort the array linearly
                        if(min>array[i][j][l]){
                            
                            min=array[i][j][l];
                            minIndex=l;
                        
                        }
                    }
                    //and here is where they get sorted into the farthest left positon (our swap)
                    if(minIndex!=k){
                    array[i][j][minIndex]=array[i][j][k];
                    array[i][j][k]=min;
                    
                    } 
                    
                }
                
            }      
        }
            
       
        
    }
    
    //to print out the arrays we use the method print array which takes input of a 4D array
    
    public static void printArray( double [][][][] array){
        
        //we loop through each dimension using their various lengths 
        for(int i=0; i<array.length; i++){
            System.out.print("{");
            for(int j=0; j<array[i].length; j++){
                System.out.print("{");
                for(int k=0; k<array[i][j].length; k++ ){
                        System.out.print("{");
                    for(int l=0; l<array[i][j][k].length; l++){
                    
                        //then we actually print out each value at the various i,j,k,l increments
                        System.out.print(" "+array[i][j][k][l]+", ");    
                    }
                    //along with printing out brackets to try to make sense of where each array ends and the next starts
                    System.out.print("}");
                    System.out.println();
                }
                System.out.print("}");
                System.out.println();
            }
            System.out.print("}");
            System.out.println();
            System.out.println();
        }
        
    }
        
    
    //MAIN METHOD- where the magic happens
    
    public static void main(String args[]){
        
        //initialize the scanner
        Scanner myScanner=new Scanner(System.in);

        //ask the user for integers to be used as boundaries for the potential lengths of the other array dimensions
        System.out.println("Enter an integer X: ");
        int x= myScanner.nextInt();
        int y;
        do{//we use a do while loop to make sure that the y value is greater than x
        System.out.println("Enter an integer Y where Y > X: ");
        y=myScanner.nextInt();
        
            //if it's not, they have to keep inputting until they get it right
            if(y<=x){
                System.out.println("Invalid input. Please enter an integer for Y>X: ");
            }
            else{
                break;
            }
        
            
        }while(true);
        
        //System.out.println("x"+x+"y"+y);
        
        
        //here we make 3 random numbers that serve as the dimensions for the 1D, 2D and 3D dimensions respectively
        //they exist between a y and x as max and min
        
        int random1= (int)((Math.random()*((y-x)+1))+x);
        int random2= (int)((Math.random()*((y-x)+1))+x);
        int random3= (int)((Math.random()*((y-x)+1))+x);
        
        //I don't need to print this but I used it a lot to check my numbers and dimensions
        //System.out.println("1= "+ random1+", 2= "+random2+", 3= "+random3);
        
        //here the 4D array is created to hold doubles, and it's sizes are my randoms
        double [][][][] array= new double[3][random3][random2][random1];
        
        double randomD=(Math.random()*31); //we make an original random number
        
        //then the array is filled with random doubles between 0-30
        //to do so we use 4 for loops to fill it

        for(int i=0; i<3; i++){
            for(int j=0; j<random3; j++){
                for(int k=0; k<random2; k++ ){
                    for(int l=0; l<random1; l++){
                    
                        //at each increment of i,j,k,l different (truncated) values are assigned to each element
                        array[i][j][k][l]=Math.floor(randomD * 10) / 10;
                        randomD=(Math.random()*31); //after each loop we make a new random number
                    }
                    
                }
            }
        }
        
        //here I print out the original array
        System.out.println();
        System.out.println("Original Array:");
        printArray(array);
        
        //then to sort the 3D arrays (so their 1D arrays are in increasing order)
        //we run a for loop to access each of them, then call the method for each time
        for(int i=0; i<array.length;i++){
            sort3DArray(array[i]);
        }
        
        //once their sorted I've been printing them out to use as comparisons to the original and to the final one
        System.out.println();
        System.out.println("4D Array after the 3D ones have been sorted:");
        printArray(array);
        
        //then we access the method sort4D using the newly organized version of array (because 3D sort made changes to it)
        System.out.println();
        System.out.println("Final Sorted 4D Array");
        
        ///we call it, it rearranges the 3D arrays in array so they're then in order with the smallest number in each 3D array
        //acting as the numbers we're comparing
        //then we print it
        sort4DArray(array);
        printArray(array);   
     
        //finally we access statArray with our final array and our dimension values to get all of the numerical data
        //about our array
        statArray(array, random1, random2, random3, 3); 
      
    }
    
    //BOOM DONE  
}