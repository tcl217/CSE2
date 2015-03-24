//Teresita Liebel
//CSE 2 HW #8
//Game homework
//We're given a main method and mostly everything that is required, we just need to write
//the final pieces of the other methods that are involved

//import scanner and declare class and main method
import java.util.Scanner;

public class HW8{
    
//copy and pasted the main method from the assignment
//it declares the scanner and prints out te various steps in the "advenure world"
//As it goes along it calls the various other metods that I had to write (or copy from the assignment)
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");//here it calls the method getInput with inputs from the scanner and a string that 
                                            //is eiter "C" or "c", that method is below
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //same getInput method is called
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();//here the method cave was copied from the assignment, it just prints out a "picture" of a cave
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //call the first getInput method again
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //call the same getInput metod again
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();//now we call the method giant to print out a pic of a giant (so scary)
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10); //Here we call our second getInput method, this one takes input as a scanner, a string, and a
                                            //counter int called trial, this is the second method I wrote after the first getInput one
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box(); //afer the "giant attack" occurs in the second getInput method the user is told they succeeded and have won a treasure box
                //the box method prints out the pictures of the boxes and asks the user to pick one
        input = getInput(scan);//they pick their prize with the last written method which just takes scanner input and with a switch statement 
                                //reveals their prize
        System.out.println("Hero! Have a good day!");
    }
    
    //1) giant method-prints out a giant
     public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /   \\  |                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    //2) cave method- prints out cave
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    //3) box metod-prints out the treasure boxes
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    //4) first getInput method
    public static String getInput(Scanner scan, String string){
        
        //first answer is declared and initialized at a pointless initial value
        String answer="";
        
        //then the if statement checks that the user gives an input, if they do the input amount is stored in the variable answer
        if(scan.hasNext()){
            answer=scan.next();
        
            //then if answer (the user input) is "C", the instructions are to continue along the adventure
            if((answer).equals("C")){
                return "C";
            }//likewise then if answer (the user input) is "c", the instructions are to continue along the adventure
            else if((answer).equals("c")){
                return "c";
            }//if the user chooses not to continue (does not input "C" or "c") they are called a loser and the game exits
            else{
                System.out.println("Yea right LOSER!");
                System.exit(0);
            }
        }
    return answer;                                                                     
    }
    
    //5) This is the second, more complicated getInput method
    //      This one will accept inputs of Aa or Ee or if they put anyting else they die (wah)
    public static String getInput(Scanner scan, String string, int trial){
        
        //first answer2 is declared and initialized at an initially pointless value
        //random is a random number that's either 0 or 1
        //random2 is a random number between 0 &10
        //counter trial is initialized at 0
        
        String answer2="";
        int random= (int)(Math.random()*2);
        int random2= (int)(Math.random()*11);
        trial=0;
        
        //first an if statement checks if the user gives an input, if so they value is stored in variable answer2
         if(scan.hasNext()){
            answer2=scan.next();
        
        
        
        //A
        
        //first I have a while statement, because if the user has 10 critical hits on the giant they win, so trial is only incremented
        //if they attack ("A" or "a") successfully (random==0)
            while(trial<10){    
                    if((answer2).equals("A")){
                        if(random==0){
                            
                            //since this was a successful hit, they are prompted to enter another instruction, trial is incremented, answer2
                            //becomes their new input value, and random is recalculated as a new random number of 0 or 1
                            System.out.println("Critical Hit");
                            trial++;
                            
                            if(trial<10){
                            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                            answer2=scan.next();
                            random= (int)(Math.random()*2);
                            }
                            
                        }
                        else if(random==1){
                            //this was not a successful hit so they are just asked to input again, answer 2 becomes the new input value and random 
                            //is recalculated as a new 0 or 1; trial is NOT incremented
                             System.out.println("Gosh! How can you miss it?!");
                             System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                            answer2=scan.next();
                            random= (int)(Math.random()*2);
                        }
                        
                    }
                    else if((answer2).equals("a")){
                        if(random==0){
                            
                            //since this was a successful hit, they are prompted to enter another instruction, trial is incremented, answer2
                            //becomes their new input value, and random is recalculated as a new random number of 0 or 1
                           
                             System.out.println("Critical Hit");
                             trial++;
                             
                             if(trial<10){
                             System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                             answer2=scan.next();
                             random= (int)(Math.random()*2);
                             }
                        }
                        else if(random==1){
                            //this was not a successful hit so they are just asked to input again, answer 2 becomes the new input value and random 
                            //is recalculated as a new 0 or 1; trial is NOT incremented
                            System.out.println("Gosh! How can you miss it?!");
                            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                            answer2=scan.next();
                            random= (int)(Math.random()*2);
                        }
                    }
            
            
        //B            
        
        //Here if the user didn't put "A" or "a", they have a chance to try to escape by typing "E" or "e" BUT they can only escape 
        //successfully if random2==10, if not they are prompted to try to attack or escape again
                            if(answer2.equals("E")){
                                if(random2!=10){
                                    //here they try to escape but they fail because random2!=10, so they have to try something else
                                    //random2 is then recalculated and answer2 becomes their new input
                                    System.out.println("Escape failed.");
                                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                                    
                                    random2= (int)(Math.random()*11);
                                    answer2=scan.next();
                                }
                                else if(random2==10){
                                    //Here this would be a successful escape because random2==10, then the user is told they escaped and \
                                    //the game ends
                                    System.out.println("You escaped successfully");
                                    System.exit(0);
                                }
                            
                            }
                            else if(answer2.equals("e")){
                                if(random2!=10){
                                    //here they try to escape but they fail because random2!=10, so they have to try something else
                                    //random2 is then recalculated and answer2 becomes their new input
                                    System.out.println("Escape Failed.");
                                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                                    
                                    random2= (int)(Math.random()*11);
                                    answer2=scan.next();
                                }
                                else if(random2==10){
                                    //Here this would be a successful escape because random2==10, then the user is told they escaped and \
                                    //the game ends
                                    System.out.println("You escaped successfully");
                                    System.exit(0);
                                }
                            
                            }
                  
                    
                    
                                
        //C       
        
        //Finally, if the user didn't try to attack or escape and typed anything else (not "A" "a" "E" or "e") they die and the game ends
                    if(!answer2.equals("A")&& !answer2.equals("a") && !answer2.equals("E") && !answer2.equals("e")){
                            System.out.println("Executed by the GIANT! Game Over!");
                            System.exit(0);
                    }
                    
            }
                  
               
                    
                    
                            
            
            
        }
    return "";
    }
   
    //6 This method just takes user input, runs a switch statement and let's them know what prize they get
    public static String getInput(Scanner scan){
        int boxes=0; //int boxes is initialized and originally delcared at 0
        
        if(scan.hasNextInt()){//if statement checks that the user input an int, if they did it is stored as variable boxes
            boxes=scan.nextInt();
            switch (boxes){
                case 1://if the user input 1, they get to pass cse and the switch statement exits
                    System.out.println("Congratulations you get to pass CSE 002!");
                    break;
                case 2://if the user input 2, they get a car and the switch statement exits
                    System.out.println("Congratulations you win a new car!");
                    break;
                case 3://if the user input 3, they get all of the food and the switch statement exits
                    System.out.println("Congratulations you get an endless supply of food!");
                    break;
                default://if the user input anything besides 1,2, or 3 they get nothing and hehe switch statement exits
                    System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                    break;
                
            }
        }
        return "";
        
    }
    
    
    
    
    
    
    
    
}
