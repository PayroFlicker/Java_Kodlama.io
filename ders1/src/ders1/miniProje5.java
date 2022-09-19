package ders1;

public class miniProje5 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		int searchNum = 2;
		
		boolean check = false;
		
		for (int number : numbers) {
			
			if (searchNum == number) {
				check = true;
				break;
			}
			
		}
		
		if (check) {
			System.out.println("Aradığınız sayı listenin içinde.");
		}
		else {
			System.out.println("Aradığınız sayı listenin içinde değil.");
		}

	}

}
