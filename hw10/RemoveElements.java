//Teresita C. Liebel
//CSE 2 hw 10
//April 7, 2015

//import scanner and declare class and main method
import java.util.Scanner;
public class RemoveElements{
      
      public static void main(String [] arg){
    	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
    	String answer="";
    	
    	//do while loop in main method runs at least once and then more times if you enter Y or y
    	do{
      	System.out.print("Random input 10 ints [0-9]");
      	num = randomInput();//array num becomes equal to the value of method randomInput
      	String out = "The original array is:";
      	out += listArray(num);
      	System.out.println(out);
     
          	System.out.print("Enter the index ");
          	index = scan.nextInt();//user inputs the index (spot to be deleted in the array)
          	newArray1 = delete(num,index);//newArray1 array becomes equal to the value of method delete 
          	String out1="The output array is ";
          	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out1);
     
        System.out.print("Enter the target value ");
      	target = scan.nextInt();//user inputs the value to be deleted from the array
      	newArray2 = remove(num,target);//newArray2 becomes equal to the value of method remove
      	String out2="The output array is ";
      	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out2);
      	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer=scan.next();
    	
    	    
    	}while(answer.equals("Y") || answer.equals("y")); 
    	
    	
      }
      //method randomInput generates a number between 0&9 and prints them, and returns them 
         public static int[] randomInput(){
            int randomNumber=(int)(Math.random()*10);
            
            int[] random;
            int size=10;
            random = new int[size];
            
            int i=0;
            for(i=0; i<size; i++){
                
                random[i]=randomNumber;
                System.out.print(" "+ random[i]+" ");
                randomNumber=(int)(Math.random()*10);
            }
            System.out.println();
            return  random;
        }
        
        //method delete takes a position value and with two for loops, copies the values from num until that number indicating a position
        //then that position is skipped with the second for loop, and the array called array continues to copy the values from array num, but
        //it is an array with a length one shorter than array num
        public static int[] delete(int list [] ,int pos){
            if(pos>=0&&pos<=9){
            int i=0;
            int[] array;
            array= new int[list.length-1];
            
            for(i=0; i<pos; i++){
                array[i]=list[i];
            }
            for(i=pos; i<array.length; i++){
                array[i]=list[i+1];
            }
            System.out.println("Index "+pos+" Element is removed.");
            return array; 
            }
            else{
                System.out.println("Not a valid index.");
                return list;
            }
        }
        
        //method remove takes 2 arrays that depending the target that is to be ommitted, changes the arrays various lengths and positions
        public static int[] remove(int list [], int target){
            
            int i=0;
            
            int[] hi =new int[list.length];
            int[] otherArray;
            
            int j=0; //length of otherArray
            for(i=0; i<list.length; i++){
                
                if(list[i]!=target){
                    //System.out.println("found target at "+i);
                    
                    hi[j]=list[i];
                    j++;
                    
                    //System.out.println(listArray(hi));
                }
                //System.out.println("found target at "+i);
            }
            otherArray=new int[j];
            for(i=0; i<otherArray.length; i++){
                otherArray[i]=hi[i];
            }
            
            
            
            return otherArray;
            
        }
        
 
              public static String listArray(int num[]){
            	String out="{";
            	for(int j=0;j<num.length;j++){
              	if(j>0){
                	out+=", ";
              	}
              	out+=num[j];
            	}
            	out+="} ";
            	return out;
              } 
}