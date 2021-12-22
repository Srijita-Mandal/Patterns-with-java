//Print pattern-> Odd Triangle special structure
//1
//3  5
//5  7  9
//7  9  11 13
//9  11 13 15 17


import java.util.*;

public class Odd_triangle {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows: ");
    int n = sc.nextInt();

    for(int i=1; i<2*n; i=i+2){
        for(int j=i; j<2*i; j=j+2){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    }
}
