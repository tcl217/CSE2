import java.util.Scanner;

public class hw10practice{
 public static void main(String [] arg){
    	Scanner scan=new Scanner(System.in);
    	
    	int num=randomInput();
    	
    //	System.out.println(num);
    	}
    	
    public static int randomInput(){
    int randomNumber=(int)(Math.random()*10);
            
            int[] random;
            int size=10;
            random = new int[size];
            
            int i=0;
            for(i=0; i<size; i++){
                
                random[i]=randomNumber;
                System.out.println("["+ random[i]+"]");
                randomNumber=(int)(Math.random()*10);
            }
            return  0;
        }
}