package main;
import java.util.Scanner;

/* 

 n = 3 

 C C C
 B B B
 A A A

A A A
n = 3  -> 65+3 = 68,67,66,65

 */

public class AlphaSqrPattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for (int i= n + 65; i >= 65; i--){
       displayAlphabet(n, i);
       System.out.println();
       }
    }

    static void displayAlphabet(int n, int code){
        for(int i =1; i <= n; i ++){
            System.out.print((char)code + " ");
        }
    }
}
