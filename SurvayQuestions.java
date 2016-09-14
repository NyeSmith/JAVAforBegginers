package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        
        String answername = sc.nextLine();
        
        System.out.println("What is your sirname?");
        
        String answersname = sc.nextLine();
        
        System.out.println("What is your age?");
        
        String answerage = sc.nextLine();
        
        System.out.println("What is your DOB");
        
        String answerdob = sc.nextLine();
        
        System.out.println("What school did you go to?");
        
        String answerschool = sc.nextLine();
        
        System.out.println("  ");
        System.out.println("Name: "+answername);
        System.out.println("Surname: "+answersname);
        System.out.println("Age: "+answerage);
        System.out.println("DOB: "+answerdob);
        System.out.println("School: "+answerschool);
        
    }
    
}
