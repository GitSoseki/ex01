import java.util.Random;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Rolling dice...");
        
        // ランダムな数値を生成するためのRandomオブジェクトを作成
        Random random = new Random();
        
        // ダイス1の結果を生成し、表示する
        int die1 = random.nextInt(6) + 1;
        System.out.println("Die 1: " + die1);
        
        // ダイス2の結果を生成し、表示する
        int die2 = random.nextInt(6) + 1;
        System.out.println("Die 2: " + die2);
        
        // 合計値を計算し、表示する
        int total = die1 + die2;
        System.out.println("Total value: " + total);


	if (total > 7) {
	    System.out.println(name + " won!");
	} else {
	    System.out.println(name + " lost!");
	}
    }
}
