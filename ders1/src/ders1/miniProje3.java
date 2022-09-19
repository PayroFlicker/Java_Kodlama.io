package ders1;

import java.util.Iterator;

public class miniProje3 {

	public static void main(String[] args) {
		
		int num, total;
		num = 496;
		total = 0;
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				total += i;
			}
		}
		
		if (total == num) {
			System.out.println("Bu sayı mükemmeldir.");
		}
		else {
			System.out.println("Bu sayı mükemmel değildir.");
		}

	}

}
