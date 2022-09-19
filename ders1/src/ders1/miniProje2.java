package ders1;

public class miniProje2 {

	public static void main(String[] args) {

		char[] kalinses = {'a', 'ı', 'o', 'u'};
		char[] inceses = {'e', 'i', 'ö', 'ü'};
		
		char harf = 'i';
		boolean var = false;
		
		
		for (char i : kalinses) {
			
			if (harf == i) {
				var = true;
			}
			
		}
		
		if (var == true) {
			System.out.println("Kalın harf.");
		}
		else {
			System.out.println("İnce harf.");
		}
		
	}

}
