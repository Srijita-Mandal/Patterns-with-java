//print pattern-> inverted half pyramid: flipped horizontally
//      *
//    * * 
//  * * *
//* * * *

import java.util.*;

public class Inverted_half_pyramid2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
          for(int j=1;j<=n;j++){
              if(j>=i){
                  System.out.print("* ");
              } else{
                  System.out.print("  ");
              }
          }
          System.out.println();
        }


        //alternative way
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        for(int i=1;i<=m;i++){
             for(int j=1;j<=m-i;j++){
                 System.out.print("  ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print("* ");
             }
             System.out.println();
             }
    }
    
}
