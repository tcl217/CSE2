//Teresita C. Liebel
//CSE 002 lab 13

public class lab13{
    
    public static int[][] copy(int[][] array){
        
        int[][] array2=new int[5][17];
        
        for(int k=0; k<array.length;k++){
        for(int i=0; i<array[k].length; i++){
            array2[k][i]=array[k][i];
        }
        }
        
        for(int k=0; k<array.length;k++){
        for(int j=0; j>array.length && j<array2.length; j++){
            array2[k][j]=0;
        }
        }
    
        return array2;
    }
    
    public static void print(int [][] array){
        
        for(int j=0; j<array.length; j++){
            for(int k=0; k<array[j].length; k++){
                System.out.print("[ "+array[j][k]+" ]");
                
            }
            System.out.println();
        }
        System.out.println();
        
    }
    
    public static void sort(int [][] array){
        
        
        
        int min;
        int minIndex;
        
        
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length-1; j++ ){
                
                    
                    minIndex = j;
                    min=array[i][j];
                    
                    
                    for(int l=j+1; l<array[i].length; l++){
                    
                       
                        if(min>array[i][l]){
                            
                            min=array[i][l];
                            minIndex=l;
                        
                        }
                    }
                   
                    if(minIndex!=j){
                    array[i][minIndex]=array[i][j];
                    array[i][j]=min;
                    
                    } 
                    
                }
                
            }      
        
        
        
        
    }
    
    
    public static void main(String args[]){
        
       
        int[][] array = new int [5][];
        for(int i = 0; i < array.length; i++){
            array[i] = new int [i*3+5];
        
        }
       
        
        int random=(int)(Math.random()*39);
        
        for(int j=0; j<array.length; j++){
            for(int k=0; k<array[j].length; k++){
                array[j][k]=random;
             
                random=(int)(Math.random()*39);   
            }
        }
        
        System.out.println("Original Array:");
        
        print(array);
        
        
        System.out.println("After Sort:");
        
        sort(array);
        
        print(array);
        
        System.out.println("After Sort and After Copy");
        int[][] array3=copy(array);
        
        print(array3);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}