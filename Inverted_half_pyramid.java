//print pattern-> inverted half pyramid: flipped vertically
//* * * *
//* * *
//* *
//*

import java.util.*;

public class Inverted_half_pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
          for(int j=1;j<=i;j++){
             System.out.print("* ");
          }
          System.out.println();
        }
    }
    
}
