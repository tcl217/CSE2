//Teresita Liebel
//CSE 002
//hw 04
//February 14,2015
//I did not know how to use a switch statement involving multiple user inputs, all our
//class examples involved just one situation, the various cases for that situation,
//and then the solution popped out. Instead I used chars and if statements, it's significantly
//longer than it probably should be but it works. 


//add scanner
import java.util.Scanner;

//add class and main method
public class WhichNumber{
    public static void main(String[] args){
        
        //declare Scanner
        Scanner myScanner=new Scanner(System.in);
        
        
        
        //prompt first input
        System.out.println("Think of a number between 1 and 10 inclusive.");
        
        System.out.print("Is your number even? ");
       
       //declare all the variables in the outside scope to use in the if statements 
        
        char answer=0; 
        char answer2=0; 
        char answer3=0; 
        char answer4=0; 
        char answer5=0;
        char answer6=0;
        char answer7=0; 
        char answer8=0;
        char answer9=0;
        char answer10=0;
        char answer11=0;
        char answer12=0;
        char answer13=0;
        char answer14=0;
        char answer15=0;
        char answer16=0;
        char answer17=0;
        char answer18=0;
        //i ran the code and realized i forgot number 4, so the answer for #4 is answer 19
        char answer19=0;
        
            
           
            //after finding out if it is even or odd, ask if it's divisible by 3
            answer =myScanner.next().charAt(0);
            if(answer=='y'|answer=='Y'){
                System.out.println("Is it divisible by 3?" );
                
                    //now it is even and divisible by 3, ask if it is 6
                    answer2 =myScanner.next().charAt(0);
                    if(answer2=='y'|answer2=='Y'){
                        System.out.println("Is your number 6? ");
                        
                        //check with user that the answer is 6
                         answer3 =myScanner.next().charAt(0);
                        if(answer3=='y'|answer3=='Y'){
                            System.out.println("Yay!");
                        }
                        else if(answer3=='n'|answer3=='N'){
                            System.out.println("This answer is not consistent.");
                        }
                        else{
                            System.out.println("Sorry this is not a valid input.");
                        }
                        
                    }//if the answer was even but not divisible by 3, we ask if it's divisible by 4
                    else if(answer2=='n'|answer2=='N'){
                        System.out.println("Is the number divisible by 4? ");
                        
                            //if it is divisible by 4 we ask if it is greater than 1 if it's divided by 4
                            answer4= myScanner.next().charAt(0);                        
                            if(answer4=='y'|answer4=='Y'){
                                System.out.println("Is the number divided by 4 greater than 1?");
                            
                                    //then if the answer is again yes, we ask if the number is 8
                                    answer5= myScanner.next().charAt(0);
                                    if (answer5=='y'|answer5=='Y'){
                                        System.out.println("Is your number 8? ");
                                        
                                            //if the answer is 8, we say yay!
                                            answer6= myScanner.next().charAt(0);
                                            if(answer6=='y'|answer6=='Y'){
                                                System.out.println("Yay!");
                                            }
                                            else if(answer6=='n'|answer6=='N'){
                                                System.out.println("That answer is not consistent.");
                                            }
                                            else{
                                                System.out.println("Sorry that is not a valid input.");
                                            }
                                            
                                    }//if the input number is even, not divisible by 3, divisible by 4 but not greater than 1 when doing so, 
                                    //ask if it's 4
                                    else if(answer5=='n'|answer5=='N'){
                                        System.out.println("Is your number 4? ");
                                        
                                            answer19=myScanner.next().charAt(0);
                                            if(answer19=='y'|answer19=='Y'){
                                                System.out.println("Yay!");
                                            }
                                            else if(answer19=='n'|answer19=='N'){
                                                System.out.println("That answer is not consistent.");
                                            }
                                            else{
                                                System.out.println("Sorry that is not a valid input.");
                                            }
                                    }
                                    else{
                                        System.out.println("Sorry this is not a valid input.");
                                    }
                        
                                    
                            }//if it was even, not divisible by 3, AND not divisible by 4, we ask if it's divisible by 5
                            else if(answer4=='n'|answer4=='N'){
                                System.out.println("Is it divisible by 5? ");
                                
                                    //if it is divisible by 5 we ask if it's 10
                                    answer7=myScanner.next().charAt(0);
                                    if(answer7=='y'|answer7=='Y'){
                                        System.out.println("Is your number 10? ");
                                            
                                            //if the answer is 10 it worked!
                                            answer8=myScanner.next().charAt(0);
                                            if(answer8=='y'|answer8=='Y'){
                                                System.out.println("Yay!");
                                            }
                                            else if(answer8=='n'|answer8=='N'){
                                                System.out.println("That answer is not consistent.");
                                            }
                                            else{
                                                System.out.println("Sorry that is not a valid input.");
                                            }
                                            
                                    }//if the answer was even, not divisible by 3, not divisible by 4, and not divisible by 5 we ask if it's 2
                                    else if(answer7=='n'|answer7=='N'){
                                        System.out.println("Is your number 2? ");
                                            
                                            //ask user if it's 2
                                            answer9=myScanner.next().charAt(0);
                                            if(answer9=='y'|answer9=='Y'){
                                                System.out.println("Yay!");
                                            }
                                            else if(answer9=='n'|answer9=='N'){
                                                System.out.println("That answer is not consistent.");
                                            }
                                            else{
                                                System.out.println("Sorry that is not a valid input.");
                                            }
                                    }
                                    else{
                                        System.out.println("Sorry that is not a valid input.");
                                    }
                            }
                            else{
                                System.out.println("Sorry that is not a valid input.");
                            }
                    }
                    else{
                        System.out.println("Sorry that is not a valid input.");
                    }
           }//now we start if the initial answer was odd
           else if(answer=='n'|answer=='N'){
               System.out.print("Is it divisible by 3? ");
           
                //ask if the answer is divisible by 3
               answer10=myScanner.next().charAt(0);
               if(answer10=='y'|answer10=='Y'){
                   System.out.println("When divided by 3 is the result greater than 1? ");
                        
                        //if it is odd and divisible by 3 we ask if when divided by 3 if it's greater than 1
                        answer11=myScanner.next().charAt(0);
                        if(answer11=='y'|answer11=='Y'){
                            System.out.println("Is your number 9? ");
                            
                                //if the answer is yes we ask if it's 9 and if it is we say YAY
                                answer12=myScanner.next().charAt(0);
                                if(answer12=='y'|answer12=='Y'){
                                    System.out.println("Yay!");
                                }
                                else if(answer12=='n'|answer12=='N'){
                                    System.out.println("That answer is not consistent.");
                                }
                                else{
                                    System.out.println("Sorry that is not a valid input.");
                                }
                                
                        }//so now if it's odd, divisble by 3 but not greater than 1 when doing so we ask if the answer is 3
                        else if(answer11=='n'|answer11=='N'){
                            System.out.println("Is your number 3? ");
                            
                                //ask user if answer is 3, woohoo
                                answer13=myScanner.next().charAt(0);
                                if(answer13=='y'|answer13=='Y'){
                                    System.out.println("Yay!");
                                }
                                else if(answer13=='n'|answer13=='N'){
                                    System.out.println("That answer is not consistent.");
                                }
                                else{
                                    System.out.println("Sorry that is not a valid input.");
                                }
                        }
                        else{
                            System.out.println("Sorry that is not a valid input.");
                        }
               }//answer is odd but not divisible by 3, ask user if it's greater than 6
               else if(answer10=='n'|answer10=='N'){
                   System.out.println("Is it greater than 6? ");
                   
                        answer14=myScanner.next().charAt(0);
                        if(answer14=='y'|answer14=='Y'){
                            System.out.println("Is your number 7? ");
                            
                                //if it is odd, not divisible by 3, and greater than 6 we ask if it's 7, and it is!
                                answer15=myScanner.next().charAt(0);
                                if(answer15=='y'|answer15=='Y'){
                                    System.out.println("Yay!");
                                }
                                else if(answer15=='n'|answer15=='N'){
                                    System.out.println("That answer is not consistent.");
                                }
                                else{
                                    System.out.println("Sorry that is not a valid input.");
                                }
                                
                        }//user's number is odd, not divisible by 3, and not greater than 6 we ask if it's less than 3
                        else if(answer14=='n'|answer14=='N'){
                            System.out.println("Is it less than 3? ");
                            
                                answer16=myScanner.next().charAt(0);
                                if(answer16=='y'|answer16=='Y'){
                                    System.out.println("Is your number 1? ");
                                    
                                        //if it is less than 3 we ask if the number is 1
                                        answer17=myScanner.next().charAt(0);
                                        if(answer17=='y'|answer17=='Y'){
                                            System.out.println("Yay!");
                                        }
                                        else if(answer17=='n'|answer17=='N'){
                                            System.out.println("That answer is not consistent.");
                                        }
                                        else{
                                            System.out.println("Sorry that is not a valid input.");
                                        }
                                        
                                }//input number is odd, not divisible by 3, not greater than 6, and not less than 3 we ask if the number is 5
                                else if (answer16=='n'|answer16=='N'){
                                    System.out.println("Is your number 5? ");
                                    
                                       //and it's 5!
                                        answer18=myScanner.next().charAt(0);
                                        if(answer18=='y'|answer18=='Y'){
                                            System.out.println("Yay!");
                                        }
                                        else if(answer18=='n'|answer18=='N'){
                                            System.out.println("That answer is not consistent.");
                                            }
                                            else{
                                                System.out.println("Sorry that is not a valid input.");
                                            }
                                }
                                else{
                                    System.out.println("Sorry that is not a valid input.");
                                }
                        }
                        else{
                            System.out.println("Sorry that is not a valid input.");
                        }
                   
               }
               else{
                   System.out.println("Sorry that is not a valid input.");
               }
           }
           else{
               System.out.println("Sorry that is not a valid input.");
           }
        
        
  
        
        
        
        
           
    }
}