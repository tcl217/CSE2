//Teresita C. Liebel
//CSE 002 lab 06
//February 27,2015
//Our program is going to use loops to print out smiley faces ":)"

public class SmileGenerator {
    public static void main(String[] args) {

        //delcare variable
        int smiley = 0;

        //Step 1- for loop
        for (smiley = 0; smiley < 5; smiley++) {
            System.out.print(":)");


        }
        System.out.println();

        //Step 1-while loop    
        smiley = 0;
        while (smiley < 5) {
            System.out.print(":)");
            smiley++;
        }
        System.out.println();

        //Step 1- do while loop
        if (smiley <= 5) {
            smiley = 0;
            do {
                System.out.print(":)");
                smiley++;
            } while (smiley < 5);

        }
        System.out.println();

System.out.println();

        //Step 2
        double smile;
        smile = Math.random() * (100 - 1) + 1;
        int s = (int) smile;

        for (smiley = 0; smiley < s; smiley++) {
            System.out.print(":)");

        }
        System.out.println();
         

        //Step 3

        for (smiley = 0; smiley < s; smiley++) {
            
            if (smiley % 30 == 0) {
                System.out.println();
            }
            System.out.print(":)");
        }
        System.out.println();

System.out.println();


        //Step 4
        
        //need to print out after the 1st smiley, then 3rd, then 6th, etc. 
        //System.out.println("");
       
       //declare x and y as grid placeholders, (x and y axise) 
        int x=1;
        int y=1;
        //make a for loop to the random number s, conditionally if it is greater than 0, and it decrements each time the loop runs
        for (; s>0; --s) {
        //if the x and y values are the same a smiley is printed and it goes to the next line    
           if(x==y){
            System.out.print(":)");
            System.out.println("");
           x=1;//then x is set back to 1 and y is incremented by 1
           y++;
               
           }
           //if x doesn't equal y, a smiley is printed and x is incremented by 1 until x=y again
           else{
               System.out.print(":)");
               x++;
           }
         
        }
        System.out.println();





    }
}
