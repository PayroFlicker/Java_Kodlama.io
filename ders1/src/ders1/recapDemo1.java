package ders1;

public class recapDemo1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 14;
		int num3 = 7;
		int topNum = num1;
		
		if (topNum < num2) {
			topNum = num2;
		}
		if (topNum < num3) {
			topNum = num3;
		}
		
		System.out.println(topNum);

	}

}
