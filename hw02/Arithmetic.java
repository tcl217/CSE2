//Teresita C. Liebel
//CSE 002
//Homework 2- Arithmetic
//January 31, 2015

public class Arithmetic{
    
    public static void main(String[] args) {
        
        //# of pairs of socks
        int nSocks=3;
        
        //$$ per pair of socks
        double sockCost$=2.58;
        
        //# of drinking glasses
        int nGlasses=6;
        
        //$$ per glass
        double glassCost$=2.29;
        
        //# of boxes of envelopes
        int nEnvelopes=1;
        
        //$$ per box of envelopes
        double envelopeCost$=3.25;
        
        //tax amount
        double taxPercent=0.06;

            //variables
            double totalSockCost$, totalGlassCost$, totalEnvelopeCost$;
            
                 System.out.println(nSocks + " pairs of socks were bought at $" + sockCost$ + " per sock");
                 System.out.println(nGlasses + " glasses were bought at $" + glassCost$ + " per glass");
                 System.out.println(nEnvelopes + " envelope was bought at $" +envelopeCost$);
                 
                    //total costs
                    totalSockCost$=nSocks*sockCost$;
                    totalGlassCost$=nGlasses*glassCost$;
                    totalEnvelopeCost$=nEnvelopes*envelopeCost$;
                    
                        //variables
                        double taxedSockCost$, taxedGlassCost$, taxedEnvelopeCost$;
                        
                            //Costs with taxes
                            taxedSockCost$=totalSockCost$*taxPercent;
                            taxedGlassCost$=totalGlassCost$*taxPercent;
                            taxedEnvelopeCost$=totalEnvelopeCost$*taxPercent;
                            
                                System.out.println("The total cost of socks is $" + totalSockCost$ + " and the sales tax on socks is $" + (int)(taxedSockCost$ *100)/100.0);
                                System.out.println("The total cost of glasses is $" + totalGlassCost$ + " and the sales tax on glasses is $" + (int)(taxedGlassCost$ *100)/100.0);
                                System.out.println("The total cost of envelopes is $" + totalEnvelopeCost$ + " and the sales tax on envelopes is $" + (int)(taxedEnvelopeCost$ *100)/100.0);
                                
                                    //variables
                                    double totalPurchase$, totalPurchaseWithTax$, totalSalesTax$;
                                  
                                    //totals
                                    totalPurchase$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
                                    totalSalesTax$=(int)((taxedEnvelopeCost$+taxedGlassCost$+taxedSockCost$)*100)/100.0;
                                    totalPurchaseWithTax$=(int)((totalPurchase$+totalSalesTax$)*100)/100.0;
                                    
                                        System.out.println("The total purchase amount before tax was $" + totalPurchase$);
                                        System.out.println("The total tax amount was $" + totalSalesTax$);
                                        System.out.println("The total purchase amount including sales tax was $" + totalPurchaseWithTax$);
                                        
        
        
    }
    
    
}