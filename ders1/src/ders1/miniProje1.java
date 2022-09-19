package ders1;

public class miniProje1 {

	public static void main(String[] args) {
		int number, counter;
		counter = 0;
		
		number = 1;

		
		if (number == 2) {
			System.out.println("Asaldır.");
		}
		else if (number < 0 || number == 1) {
			System.out.println("Geçersiz sayı.");
			return;
		}
		
		else {
			
			for (int i = 2; i < number; i++) {
				
				if (number %  i == 0) {
					counter = counter + 1;
				}
			}
		
			
		}
		
		if (counter == 0) {
			System.out.println("Asaldır.");
		}
		else {
			System.out.println("Asal Değildir.");
		}

	}

}
