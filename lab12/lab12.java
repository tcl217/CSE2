//Teresita C. Liebel
//CSE 2 Lab 12

public class lab12{
    
    public static int[][] increasingMatrix(int width, int height, boolean format){
        
        int[][] array;
        int number=0;
        
        if(format==true){
            array= new int[width][height];
        
            for(int i=0; i<height; i++){
                for(int j=0; j<width; j++){
                    array[j][i]=number;
                    number++;
                }
            }
            
        }
        else{
            array=new int[height][width];
            
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    array[j][i]=number;
                    number++;
                }
            }
        }
        
        
    return array;   
    }
     
    public static void printMatrix(int [][] array, boolean format){
        
        if(format==true){
            for(int i=0; i<array[0].length; i++){
                for(int j=0; j<array.length; j++){
                    System.out.print("{ "+array[j][i]+" }");
                    
                }
                System.out.println();
            }
        }
        else if(format==false){
            
            for(int i=0; i<array.length; i++){
                for(int j=0; j<array[0].length; j++){
                    System.out.print("{ "+array[i][j]+" }");
                }
                System.out.println();
            }
            
        }
        
    }
    

    public static int [][] translate(int [][] array){
       
       int [][] newArray= new int[array[0].length][array.length];
       
       for(int i=0; i<array[0].length; i++){
           for(int j=0; j<array.length; j++){
               newArray[i][j]=array[j][i];
           }
       } 
    return array;
    }
    
        
    public static int [][] addMatrix(int[][] a, boolean formata, int [][]b, boolean formatb){
       
       int [][] array;
       
       if(formata&&formatb){
           if(a.length==b.length&&a[0].length==b[0].length){
               
               array=new int[a[0].length][a.length];
               
               for (int i=0; i<a[0].length; i++){
                   for(int j=0; j<a.length; j++){
                       array[j][i]=(a[j][i]+b[j][i]);
                   }
               }
               
           }
           else{
               System.out.println("The arrays cannot be added!");
               return null;
           }
           
       }
       else{
           int[][]newb=translate(b);
           
           if(a.length==b.length&&a[0].length==b[0].length){
               
               array=new int[a[0].length][a.length];
               
               for (int i=0; i<a[0].length; i++){
                   for(int j=0; j<a.length; j++){
                       array[j][i]=(a[j][i]+b[j][i]);
                   }
               }
               
           }
           else{
               System.out.println("The arrays cannot be added!");
               return null;
           }
           
       }
       
    return array;    
    }
    
    
    public static void main(String args[]){
        int width1=(int)((Math.random()*10)+1);
        int width2=(int)((Math.random()*10)+1);
        int height1=(int)((Math.random()*10)+1);
        int height2=(int)((Math.random()*10)+1);
        
        System.out.println("W1: "+width1);
        System.out.println("H1: "+height1);
        System.out.println("W2: "+width2);
        System.out.println("H2: "+height2);
        
        //int[][] A= new int[height1][width1];
        
        int[][] A=increasingMatrix(width1, height1, true);
        
        //int[][]B= new int[width1][height1];
        
        int [][] B=increasingMatrix(width1, height1, false);
        
        //int [][] C= new int[height2][width2];
        
        int [][] C=increasingMatrix(width2, height2, true);
        
        System.out.println("A");
        printMatrix(A,true);
        
        System.out.println("B");
        printMatrix(B, false);
        
        System.out.println("C");
        printMatrix(C, true);
        
       // System.out.println("B changed to row major.");
        //int[][]newB=translate(B);
        
        //printMatrix(newB, true);
        
        
        int [][] aPlusB=addMatrix(A, true, B, false);
        if(aPlusB!=null){
            System.out.println("Try to add A+B");
            printMatrix(aPlusB, true);
        }
       
        int[][] aPlusC=addMatrix(A, true, C, true);
        if(aPlusC!=null){
             System.out.println("Try to add A+C");
            printMatrix(aPlusC,true);
        }
        
       
        
        
        
    }
    
 
    
}