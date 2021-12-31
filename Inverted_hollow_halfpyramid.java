//Print pattern-> Inverted Hollow Half Pyramid
// * * * * *
// *     *
// *   *
// * *
// *

import java.util.*;
public class pattern{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows: ");
    int n = sc.nextInt();
    
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
             if(i==n || i==1 || j==1 || j==i){
                 System.out.print("* ");
             } else{
                 System.out.print("  ");
             }
        }
        System.out.println();
        }

    }
}
