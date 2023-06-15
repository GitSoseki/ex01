import java.util.Random;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.printf("What is your name?\n>");
	String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Rolling dice...");
        
        Random random = new Random();
        
        int die1 = random.nextInt(6) + 1;
        System.out.println("Die 1: " + die1);
        
        int die2 = random.nextInt(6) + 1;
        System.out.println("Die 2: " + die2);
        
        int total = die1 + die2;
        System.out.println("Total value: " + total);


	if (total > 7) {
	    System.out.println(name + " won!");
	} else {
	    System.out.println(name + " lost!");
	}
    }
}
