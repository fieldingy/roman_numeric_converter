package org.code.sample;

public class RomanNumericConvertor {

	private static final String ZERO_VALUE = "";
	private static final String [][] ROMAN_NUMEREIC_CHARS = {
		{"I", "II", "III", "IV", "V", "VI", "VII", "VII", "IX"},
		{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
		{"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
		{"M", "MM", "MMM"},
	};

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("This program will take one and only one parameter, which should be an integer");
			return;
		}
		
		String inputValue = args[0];
		if(Integer.parseInt(inputValue) > 3999) {
			System.out.println("The value must be less than 4000");
			return;
		}

		int inputSize = inputValue.length();
		
		StringBuilder romanNumericValue = new StringBuilder();
		
		for(int index = 0; index < inputSize; index++) {
			int digit = inputSize - index;
			
			romanNumericValue.append(convertRomanNumeric(Character.getNumericValue(inputValue.charAt(index)), digit));
		}
		
		System.out.println(romanNumericValue.toString());
		
		
	}


	private static String convertRomanNumeric(int numericValue, int digit) {
		if(numericValue == 0) {
			return ZERO_VALUE;
		} else {
			return ROMAN_NUMEREIC_CHARS[digit - 1][numericValue - 1];
		}
	}

}
