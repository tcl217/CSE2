//Teresita C. Liebel
//CSE 2 lab 5
//February 20,2015
//This program is going to use a randomly assigned date from the Math.random() function, and using a switch
//statement, output all of the major space exploration events that occured between the two dates. The range
//for years is from 2000-2010.

public class SpaceExplorationBad{
    public static void main(String [] args){
        
        //get the random number generated between 2000-2010
         int randomYear = (int)(Math.random()*(2010-2000))+2000;
        
        //print out the introducing sentence
        System.out.println("Here is a timeline of space exploration events from "+ randomYear+ " to 2000.");
            
            //make a switch statement for the exploration events
            switch(randomYear){
                case 2010:
                    System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back.");
                    System.out.println("2009: N/A");
                    System.out.println("2008: Kepler launched to study deep space.");
                    System.out.println("2007: N/A");                                
                    System.out.println("2006: Spacecraft returns with collections from a comet.");                                
                    System.out.println("2005: Spacecraft collides with comet.");                                
                    System.out.println("2004: N/A");                                
                    System.out.println("2003: Largest infrared telescope released.");                                                
                    System.out.println("2002: N/A");
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2009:
                    System.out.println("2009: N/A");
                    System.out.println("2008: Kepler launched to study deep space.");
                    System.out.println("2007: N/A");                                
                    System.out.println("2006: Spacecraft returns with collections from a comet.");                                
                    System.out.println("2005: Spacecraft collides with comet.");                                
                    System.out.println("2004: N/A");                                
                    System.out.println("2003: Largest infrared telescope released.");                                                
                    System.out.println("2002: N/A");
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2008:
                    System.out.println("2008: Kepler launched to study deep space.");
                    System.out.println("2007: N/A");                                
                    System.out.println("2006: Spacecraft returns with collections from a comet.");                                
                    System.out.println("2005: Spacecraft collides with comet.");                                
                    System.out.println("2004: N/A");                                
                    System.out.println("2003: Largest infrared telescope released.");                                                
                    System.out.println("2002: N/A");
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2007:
                    System.out.println("2007: N/A");
                    System.out.println("2006: Spacecraft returns with collections from a comet.");                                
                    System.out.println("2005: Spacecraft collides with comet.");                                
                    System.out.println("2004: N/A");                                
                    System.out.println("2003: Largest infrared telescope released.");                                                
                    System.out.println("2002: N/A");
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2006:
                    System.out.println("2006: Spacecraft returns with collections from a comet.");
                    System.out.println("2005: Spacecraft collides with comet.");                                
                    System.out.println("2004: N/A");                                
                    System.out.println("2003: Largest infrared telescope released.");                                                
                    System.out.println("2002: N/A");
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2005:
                    System.out.println("2005: Spacecraft collides with comet.");
                    System.out.println("2004: N/A");                                
                    System.out.println("2003: Largest infrared telescope released.");                                                
                    System.out.println("2002: N/A");
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2004:
                    System.out.println("2004: N/A");
                    System.out.println("2003: Largest infrared telescope released.");                                                
                    System.out.println("2002: N/A");
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2003:
                    System.out.println("2003: Largest infrared telescope released.");
                    System.out.println("2002: N/A");
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2002:
                    System.out.println("2002: N/A");
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2001:
                    System.out.println("2001: First spacecraft lands on asteroid.");
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
                case 2000:
                    System.out.println("2000: First spacecraft orbits an asteroid.");
                    break;
            }
    
        
    }
}