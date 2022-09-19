package ders1;

import java.util.Iterator;

public class recapDemo2 {

	public static void main(String[] args) {
		double[] myList  = {1.2 , 1.65 , 25.5 , 2, 4, 12, 5, 45};
		double total = 0;
		double max = myList[0];
		
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		
		System.out.println("Toplam: "+ total);
		System.out.println("En büyük sayi: " + max);

	}

}
