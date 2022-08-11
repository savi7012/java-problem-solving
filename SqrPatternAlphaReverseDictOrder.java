import java.util.Scanner;

/* 
n = 3
C B A
C B A
C B A

C B A  
n = 3 + 65 -> 68,67,66,65


*/


public class SqrPatternAlphaReverseDictOrder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            displayPattern(3);
            System.out.println();
        }
        sc.close();

    }
    static void displayPattern(int n){
        for(int i = n + 65; i >= 65; i--){
            System.out.print((char)i + " ");
        }
    }
}
