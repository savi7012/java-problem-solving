package main;
import java.util.Scanner;

/**
 * HelloWorldAdv
 * 
 * ip - name
 * op - hello , name, nice to meet you 
 * 
 * algo 
 * get name from scanner
 * store in name var
 * give name to display fn
 * call name fn
 * 
 * display fn -get name and print msg
 *      
 */

public class HelloWorldAdv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        display(name);
        sc.close();

    }

    private static void display(String name){
        System.out.println("Hello, "+ name + ", nice to meet you !!!");
    }
}