package practice_question;

import java.util.Scanner;

public class Q5 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	//Q5 : Print floyed's triangle ?
	
	System.out.println("Give me a number");
	int rows=sc.nextInt();
	int num=1;
	
	for(int i = 1; i<=rows;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
	}
}
}
