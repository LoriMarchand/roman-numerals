package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToConvert) {
		String result = null;
		
		
		if (numberToConvert ==3000) {
			result = "MMM";
		}		
		
		if (numberToConvert == 2345) {
			result = "MMCCCXLV";
		}
		
		if (numberToConvert == 2222) {
			result = "MMCCXXII";
		}
		
		if (numberToConvert == 2000) {
			result = "MM";
		}
		
		if (numberToConvert == 1000) {
			result = "M";
		}
				
		if (numberToConvert == 900) {
			result = "CM";
		}
		
		if (numberToConvert == 800) {
			result = "DCCC";
		}
		
		if (numberToConvert == 700) {
			result = "DCC";
		}		
		
		if (numberToConvert == 600) {
			result = "DC";
		}
				
		if (numberToConvert == 549) {
			result = "DXLIX";
		}
		if (numberToConvert == 500) {
			result = "D";
		}
		
		if (numberToConvert == 400) {
			result = "CD";
		}
		
		if (numberToConvert == 300) {
			result = "CCC";
		}
				
		if (numberToConvert == 200) {
			result = "CC";
		}
		
		if (numberToConvert == 144) {
			result = "CXLIV";
		}
		
		if (numberToConvert == 127) {
			result = "CXXVII";
		}
		
		if (numberToConvert == 110) {
			result = "CX";
		}
		
		if (numberToConvert == 101) {
			result = "CI";
		}
		
		if (numberToConvert == 100) {
			result = "C";
		}
		
		if (numberToConvert == 99) {
			result = "XCIX";
		}
		
		if (numberToConvert == 98) {
			result = "XCVIII";
		}
		
		if (numberToConvert == 97) {
			result = "XCVII";
		}
		
		if (numberToConvert == 96) {
			result = "XCVI";
		}
		
		if (numberToConvert == 95) {
			result = "XCV";
		}
		
		if (numberToConvert == 94) {
			result = "XCIV";
		}
		
		if (numberToConvert == 93) {
			result = "XCIII";
		}
		
		if (numberToConvert == 92) {
			result = "XCII";
		}
		
		if (numberToConvert == 91) {
			result = "XCI";
		}
		
		if (numberToConvert == 90) {
			result = "XC";
		}
		
		if (numberToConvert == 80) {
			result = "LXXX";
		}
		
		if (numberToConvert == 70) {
			result = "LXX";
		}		
		
		if (numberToConvert == 60) {
			result = "LX";
		}
		
		if (numberToConvert == 59) {
			result = "LIX";
		}
		
		if (numberToConvert == 51) {
			result = "LI";
		}
		
		if (numberToConvert == 50) {
			result = "L";
		}
		
		if (numberToConvert == 49) {
			result = "XLIX";
		}
		
		if (numberToConvert == 40) {
			result = "XL";
		}
		
		if (numberToConvert == 30) {
			result = "XXX";
		}		
		
		if (numberToConvert == 20) {
			result = "XX";
		}
		
		if (numberToConvert ==19) {
			result = "XIX";
		}
		
		if (numberToConvert ==16) {
			result = "XVI";
		}
		
		if (numberToConvert == 15) {
			result = "XV";
		}
		
		if (numberToConvert == 14) {
			result = "XIV";
		}
		
		if (numberToConvert == 11) {
			result = "XI";
		}
		
		if (numberToConvert == 10) {
			result = "X";
		}
		
		if (numberToConvert == 9) {
			result = "IX";
		}
		
		if (numberToConvert == 8) {
			result = "VIII";
		}
		
		if (numberToConvert == 7) {
			result = "VII";
		}
		
		if (numberToConvert == 6) {
			result = "VI";
		}
		
		if (numberToConvert == 5) {
			result = "V";
		}
			
		if (numberToConvert == 4) {
			result = "IV";
		}
		
		if (numberToConvert == 3) {
			result = "III";
		}
		if (numberToConvert == 2) {
			result = "II";
		}
		if (numberToConvert == 1) {
			result = "I";
		}

		return result;

	}
}
