package main;
import java.util.Scanner;

public class CountNumberOfString {

    public static void main(String[] args) {
        
        String name = input();
        int strLength = getInputStringLength(name);
        display(name, strLength);
    }

    public static int getInputStringLength(String str){
        return str.length();
    }

    public static String input(){

        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            return name;
        }
    }

    public static void display(String str, int length){
        System.err.printf("%s length is %d", str, length);
    }

   
}
