package main;
import java.util.Scanner;

/*

n = 3
5 4 3 2 1
5 4 3 2 1 
5 4 3 2 1 

5 4 3 2 1 
*/

public class SqrPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            displayPattern(n);
            System.out.println();
        }
        sc.close();
    }

    static void displayPattern(int n){
        for(int i = n ; i >= 1; i--){
            System.out.print(i+" ");
        }
    }
}
