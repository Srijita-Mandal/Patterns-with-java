//print pattern-> inverted Half pyramid with numbers
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2 
//1 

import java.util.*;

public class Inverted_halfpyramid_withnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
          for(int j=1;j<=i;j++){
             System.out.print(j+" ");
          }
          System.out.println();
        }
    }
    
}
