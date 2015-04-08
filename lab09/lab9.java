import java.util.Random;
import java.util.Scanner;

public class lab9{
    public static void main (String[] args){

        Random randomGenerator=new Random();
        Scanner myScanner=new Scanner(System.in);
        
        int randomInt=randomGenerator.nextInt(10);
        int x=1;
            
            do{
                System.out.println("The"+ Adjectives()+Adjectives()+SubjectNouns()+PastTenseVerbs()+"the"+Adjectives()+ObjectNouns());
                
                System.out.println("Do you want to go again? Type 1 for yes and 2 for no.");
                    x=myScanner.nextInt();
                    
                    if(x==2){
                        break;
                    }
            } while(x==1);
                
        
    }

    public static String Adjectives(){
    
    Random randomGenerator=new Random();
    int randomInt=randomGenerator.nextInt(10);
    
        switch(randomInt){
            case 0: 
                return " quick ";
                 
            case 1:
                return " fat ";
                 
            case 2:
                return " pretty "; 
                 
            case 3:
                return " old "; 
                 
            case 4:
                return " excited "; 
                 
            case 5:
                return " tiny "; 
                 
            case 6:
                return " happy "; 
                 
            case 7:
                return " sad "; 
                 
            case 8:
                return " tired "; 
                 
            case 9:
                return " energetic "; 
                 
        }
    return "";
    }
    
    public static String SubjectNouns(){
    
    Random randomGenerator=new Random();
    int randomInt=randomGenerator.nextInt(10);
    
        switch(randomInt){
            case 0: 
                return " dog ";
                 
            case 1:
                return " boy ";
                 
            case 2:
                return " girl "; 
                 
            case 3:
                return " mother "; 
                 
            case 4:
                return " father "; 
                 
            case 5:
                return " brother "; 
                 
            case 6:
                return " teacher "; 
                 
            case 7:
                return " student "; 
                 
            case 8:
                return " employee "; 
                 
            case 9:
                return " boss "; 
                 
                
        }
    return "";
    }
    
    public static String PastTenseVerbs(){
    
    Random randomGenerator=new Random();
    int randomInt=randomGenerator.nextInt(10);
    
        switch(randomInt){
            case 0: 
                return " hid from ";
                 
            case 1:
                return " ran to ";
                 
            case 2:
                return " jumped over "; 
                 
            case 3:
                return " swam with "; 
                 
            case 4:
                return " talked to "; 
                 
            case 5:
                return " cried over "; 
                 
            case 6:
                return " taught "; 
                 
            case 7:
                return " spoke to "; 
                 
            case 8:
                return " ate "; 
                 
            case 9:
                return " drove to "; 
                 
        }
    return "";
    }
    
    public static String ObjectNouns(){
    
    Random randomGenerator=new Random();
    int randomInt=randomGenerator.nextInt(10);
    
        switch(randomInt){
            case 0: 
                return " dinner ";
                 
            case 1:
                return " child ";
                 
            case 2:
                return " police "; 
                 
            case 3:
                return " parent "; 
                 
            case 4:
                return " plane "; 
                 
            case 5:
                return " tree "; 
                 
            case 6:
                return " food "; 
                 
            case 7:
                return " class "; 
                 
            case 8:
                return " computer "; 
                 
            case 9:
                return " book "; 
                 
                
        }
    return "";
    } 


    
}